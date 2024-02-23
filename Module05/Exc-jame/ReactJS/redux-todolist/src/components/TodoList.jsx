import React from 'react'
import { useSelector } from 'react-redux'
import TodoListItem from './TodoListItem';

const selectTodos = state => state.todos
function TodoList() {
    const todos = useSelector(selectTodos);

    return (
        <div>
            {todos.map((todo) => {
                return (
                    <TodoListItem todo={todo} key={todo.id} />
                )
            })}
        </div>
    )
}

export default TodoList