import React, { Component } from 'react'

export default class ConditionRendering extends Component {
  render() {
    
    return (
      <div>
        <button onClick={this.props.onCollapse}>Đóng giới thiệu</button>
        <h2>Giới thiệu</h2>
        <p>Trong ReactJS, đôi khi bạn có một số component và tùy thuộc vào từng điều
            kiện ví dụ như trạng thái của state, props,... mà bạn muốn hiển thị một hoặc
            một số component nào đó. Khi đó bạn có thể sử dụng Condition Rendering để
            render ra component mà bạn mong muốn.
        </p>
      </div>
    )
  }
}
