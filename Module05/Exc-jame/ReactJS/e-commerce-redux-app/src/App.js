
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import { Home } from './components/Home';
import { Navbar } from './components/Navbar';
import { Products } from './components/Products';
import { Product } from './components/Product';
  function App() {
    return (
      <div className="App">
          <Navbar />
          <Routes>
            <Route path="/" element={<Home/>} />
            <Route path="/products" element={<Products/>} />
            <Route path="/products/:id" element={<Product/>} />
            {/* <Route path=""element={<Cart/>}/> */}
          </Routes>
        </div>
    
    );
  }

export default App;
