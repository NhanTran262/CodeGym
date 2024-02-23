import React from 'react'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import Category from './Category'
import Product from './Product'
function AppRouter2() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path='/' element={<Category />} />
                <Route path='/product/:categoryId' element={<Product />} />
            </Routes>
        </BrowserRouter>
    )
}

export default AppRouter2