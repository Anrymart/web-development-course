import React from "react";
import {Square} from "./Square";

export class Board extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            squares: []
        };
    }

    renderSquare(i) {
        return <Square value={this.state.squares[i]} onClick={() => this.updateValue(i)}/>;
    }

    updateValue(i) {
        const newSquares = [...this.state.squares];
        newSquares[i] = 'X';
        console.log('Updating square value');
        this.setState({squares: newSquares});
    }

    render() {
        const status = 'Next player: X';

        return (
            <div>
                <div className="status">{status}</div>
                <div className="board-row">
                    {this.renderSquare(0)}
                    {this.renderSquare(1)}
                    {this.renderSquare(2)}
                </div>
                <div className="board-row">
                    {this.renderSquare(3)}
                    {this.renderSquare(4)}
                    {this.renderSquare(5)}
                </div>
                <div className="board-row">
                    {this.renderSquare(6)}
                    {this.renderSquare(7)}
                    {this.renderSquare(8)}
                </div>
            </div>
        );
    }
}
