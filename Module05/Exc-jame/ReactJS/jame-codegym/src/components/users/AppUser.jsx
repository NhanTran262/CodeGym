import React, { Component } from 'react'
import axios from 'axios';
export default class AppUser extends Component {
    constructor(props) {
        super(props);
        this.state = {
            users: []
        };
    }
    componentDidMount() {
        axios
            .get("http://localhost:3001/api/jobs")
            .then(res => {
                this.setState({ users: res.data })
            })
            .catch(err => {
                throw err;
            });
    }
    render() {
        const { users } = this.state;
        return (
            <div>
                <h1>Users</h1>
                <ul>
                    {users.map(user => (
                        <ul>
                        <li key={user.id}>{user.id}</li>
                        <li key={user.id}>{user.name}</li>
                        </ul>
                    ))}
                </ul>
            </div>
        );
    }
}
