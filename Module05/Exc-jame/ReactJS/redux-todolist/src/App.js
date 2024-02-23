
import './App.css';
import { Provider } from 'react-redux';
import store from './app/store';
import NewTodo from './components/NewTodo';
import TodoList from './components/TodoList';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';

function App() {
  return (
    <div className="container">
      <div style={{ marginTop: 40 }}>
        <h1>Todo List</h1>
        <Provider store={store}>
          <div>
            <NewTodo />
          </div>
          <div>
            <TodoList />
          </div>
        </Provider>
      </div>
    </div>
  );
}

export default App;
