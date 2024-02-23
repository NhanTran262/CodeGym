import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { deleteUser } from '../redux/actions/deleteAction';
import { FETCH_USER } from '../constants/userConstants';
import { getUsers } from '../redux/actions/userAction';
import { selectUsers } from '../redux/reducers/userReducer';

function UserList() {
    const users = useSelector(selectUsers);
    const dispatch = useDispatch();
    const handleDeleteUser = (userId) => {
        dispatch(deleteUser(userId));
    };
    return (
        <div>
            <button onClick={() => dispatch({ type: FETCH_USER })}>Get Users</button>
            <table border={1} style={{ textAlign: "left" }}>
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Website</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    {users.map((user) => (
                        <tr key={user.id}>
                            <td>{user.id}</td>
                            <td>{user.username}</td>
                            <td>{user.email}</td>
                            <td>{user.website}</td>
                            <td>
                                <button onClick={() => handleDeleteUser(user.id)}>Remove</button>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}

export default UserList