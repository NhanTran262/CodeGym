import logo from './logo.svg';
import './App.css';
import { Provider } from 'react-redux';
import { BrowserRouter, Routes,Route } from 'react-router-dom';
import Login from './components/Login';
import User from './components/User';
import store from './app/store';
function App() {
  return (
    <div className="App">
      <Provider store={store}>
        <BrowserRouter>
          <Routes>
            <Route path="/" element={<Login />} />

            <Route path="/users" element={<User />} />
          </Routes>
        </BrowserRouter>
      </Provider>
    </div>
  );
}

export default App;
