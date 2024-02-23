
import './App.css';
import { Provider } from 'react-redux';
import store from './app/store';
import UserList from './components/UserList';

function App() {
  return (
    <div className="App">
     <Provider store={store}>
      <UserList/>
     </Provider>
    </div>
  );
}

export default App;
