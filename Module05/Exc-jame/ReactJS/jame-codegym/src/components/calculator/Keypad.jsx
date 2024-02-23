import React, { Component } from 'react'
import './Calculate.css'
export default class Keypad extends Component {
  render() {
    return (
      <div className='keypad'>{this.props.children}</div>
    )
  }
}
