import React, { Component } from 'react'
import './Calculate.css'
export default class Button extends Component {
  render() {
    return (
      <div className='button' 
      onClick={this.props.onClick}
      data-size={this.props.size}
      data-value={this.props.value}>{this.props.label}</div>
    )
  }
}
