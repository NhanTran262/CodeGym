import React, { Component } from 'react'

export default class AppComponents extends Component {
  constructor(props) {
    super(props);
    this.state = {
      number: 0,
      color: 'black'
    };
  }
  componentDidMount() {
    setTimeout(() => {
      this.setState({ color: 'pink' });
    }, 5000)
  }
  increase = () => {
    this.setState({ number: this.state.number + 1 });
  };
  decrease = () => {
    this.setState({ number: this.state.number - 1 });
  };
  render() {
    return (
      <div>
        <div
          style={{
            backgroundColor: this.state.color,
            paddingTop: 20,
            width: 400,
            height: 80,
            margin: 'auto'
          }}
        />
        <div style={{ textAlign: "center", padding: 30 }}>
          <button onClick={this.decrease}>Decrease</button>
          <span style={{ padding: 10 }}>{this.state.number}</span>
          <button onClick={this.increase}>Increase</button>
        </div>
      </div>

    )
  }
}
