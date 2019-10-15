import React from 'react';

class Product extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div className="product">
                {this.props.data.name}
                <img alt="product image" src={this.props.data.imageUrl}/>
                <p>Description: {this.props.data.description}</p>
                <p>Price: {this.props.data.price}</p>
            </div>
        );
    }
}

export default Product;
