import React from 'react';

class Product extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div className="product">
                <img alt="product image" src={this.props.data.imageUrl}/>
                <div className="product-title">
                    {this.props.data.name}
                </div>
                <div className="product-description">{this.props.data.description}</div>
                <p>${this.props.data.price}</p>
            </div>
        );
    }
}

export default Product;
