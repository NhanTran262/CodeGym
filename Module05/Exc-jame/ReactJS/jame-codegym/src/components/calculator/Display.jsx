import React, { Component } from 'react'
import './Calculate.css'

export default class Display extends Component {
  render() {
    return (
      <div className='display'>{this.props.data}</div>
    )
  }
}
