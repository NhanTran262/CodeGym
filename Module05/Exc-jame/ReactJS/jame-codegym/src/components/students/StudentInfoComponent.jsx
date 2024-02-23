import React from 'react'
import './student.css'

function StudentInfoComponent() {
    const studentList = [
        {
            id: 1,
            name: 'Hoàng Nhân',
            age: 19,
            address: 'Hcm'
        },
        {
            id: 2,
            name: 'Thành Đạt',
            age: 18,
            address: 'Hcm'
        },
        {
            id: 3,
            name: 'Kiệt Lon',
            age: 10,
            address: 'DL'
        },
    ]
    return (
        <div>
            <h1>Student List</h1>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Address</th>
                </tr>
                {studentList.map((student) =>
                        <tr>
                            <td>{student.id}</td>
                            <td>{student.name}</td>
                            <td>{student.age}</td>
                            <td>{student.address}</td>
                        </tr>  
                )}
            </table>
        </div>
    )
}

export default StudentInfoComponent