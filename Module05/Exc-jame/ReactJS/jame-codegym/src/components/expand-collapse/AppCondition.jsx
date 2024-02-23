import React, { Component } from 'react'
import ConditionRendering from './ConditionRendering';

export default class AppCondition extends Component {
    constructor(props) {
        super(props)
        this.state = {
            isExpand: false
        };
    }
    handlerExpand = () => {
        this.setState({ isExpand: true });
    }
    handlerCollapse = () => {
        this.setState({ isExpand: false });
    }
    render() {
        const {isExpand}=this.state
        if(isExpand) return (<ConditionRendering onCollapse={this.handlerCollapse}/>)
        return (
            <div><h1 style={{textAlign:'center', backgroundColor:'green'}}>
            Conditional Rendering
        </h1>
        <button onClick={this.handlerExpand}>Xem giới thiệu</button>
        </div>
        )
    }
}
