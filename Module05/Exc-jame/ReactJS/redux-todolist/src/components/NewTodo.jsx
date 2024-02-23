import React, { useState } from 'react'
import { useDispatch } from 'react-redux';
import { addTodoAction } from '../redux/actions/addTodoAction';
import { v4 as uuidv1 } from 'uuid';
function NewTodo() {
    const [text, setText] = useState("");
    const dispatch = useDispatch();
    const handleInputChange = (e) => {
        setText(e.target.value);
    }
    const handleSubmit = () => {
        dispatch(addTodoAction({
            id: uuidv1(),
            text: text,
        }))
        setText("");
    };
    return (
        <div>
            <div className="d-flex">
                <div className="col-md-6">
                    <input type="text"
                        placeholder="Enter new task"
                        className="form-control"
                        onChange={handleInputChange}
                        value={text}
                    />
                </div>
                <div className="mx=sm-3 mb-2">
                    <button type="button"
                        className="btn btn-primary"
                        onClick={handleSubmit}>Add</button>
                </div>
            </div>
        </div>
    )
}

export default NewTodo