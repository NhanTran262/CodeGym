import React, { Component } from 'react'

export default class Hello extends Component {
    componentWillUnmount(){
        alert('The component is going to be unmounted');
    }
  render() {
    return (
      <div><h1>Hello Word!</h1></div>
    )
  }
}
