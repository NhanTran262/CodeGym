
import './App.css';
import Gift from './components/gifts-random/Gift';
import CheckBox from './components/way-binding/CheckBox';
import CheckRadio from './components/way-binding/CheckRadio';
import Name from './components/way-binding/Name';
import TodoList from './components/way-binding/TodoList';

function App() {
  return (
    <div className="App">
      {/* <Gift/> */}
      {/* <Name/> */}
      {/* <CheckRadio/> */}
      {/* <CheckBox/> */}
      <TodoList/>
    </div>
  );
}

export default App;
