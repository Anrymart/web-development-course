import React from 'react';

class Product extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div className="product">
                {this.props.data.name}
                <img al="product image" src={this.props.data.imageUrl}/>
            </div>
        );
    }
}

export default Product;
