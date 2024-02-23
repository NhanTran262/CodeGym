import React from 'react';
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import ProductList from './components/product/ProductList';
import ProductDetail from './components/product/ProductDetail';
import AddProduct from './components/product/AddProduct';
import EditProduct from './components/product/EditProduct';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<ProductList />} />
        <Route path={`/product/:productId`} element={<ProductDetail />} />
        <Route path={"/product/add"} element={<AddProduct />} />
        <Route path={`/product/edit/:productId`} element={<EditProduct/>}/>
      </Routes>

    </BrowserRouter>
  );
}

export default App;
