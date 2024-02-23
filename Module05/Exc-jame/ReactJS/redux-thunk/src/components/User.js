import React from 'react'
import { useSelector } from 'react-redux'
import { selectUsers } from '../redux/reducers/userReducer'

function User() {
    const users = useSelector(selectUsers);

    return (
        <div>
            <table border={1} style={{ textAlign: "left" }}>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Website</th>
                    </tr>
                </thead>
                <tbody>
                    {users.map((user) => (
                        <tr key={user.id}>
                            <td>{user.id}</td>
                            <td>{user.username}</td>
                            <td>{user.email}</td>
                            <td>{user.website}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}

export default User