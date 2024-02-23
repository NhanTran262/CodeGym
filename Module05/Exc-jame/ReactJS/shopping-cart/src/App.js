import logo from './logo.svg';
import './App.css';
import { Provider } from 'react-redux';
import store from './app/store';
import ProductList from './components/ProductList';
import Cart from './components/Cart';

function App() {
  return (
    <div className="App">
      <Provider store={store}>
      <h2>Shopping Cart</h2>
      <hr/>
        <ProductList/>
        <hr/>
        <Cart/>
      </Provider>
    </div>
  );
}

export default App;
