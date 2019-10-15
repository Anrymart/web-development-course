import React from 'react';
import axios from 'axios';
import Product from "./Product";

class Main extends React.Component {
    constructor(props) {
        super(props);

        this.state = {};

        this.loadData();
    }

    loadData() {
        axios.get('http://localhost:8080/api/products')
            .then((response) => {
                console.log(response);
                this.setState({products: response.data});
            });
        this.render();
    }

    render() {
        const products = [];
        if (this.state.products) {
            for (let product of this.state.products) {
                products.push(<Product data={product}/>);
            }
        }
        return (
            <div className="main">
                {products}
            </div>
        );
    }
}

export default Main;
