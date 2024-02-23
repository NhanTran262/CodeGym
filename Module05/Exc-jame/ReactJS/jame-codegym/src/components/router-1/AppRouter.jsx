import React from 'react'
import {BrowserRouter, Routes, Route, Link } from 'react-router-dom'
import About from './About'
import Home from './Home'
import Contact from './Contact'

function AppRouter() {
    return (
        <div>
            <ul>
                <li>
                   <Link to="/">Home</Link>
                </li>
                <li>
                   <Link to="/about">About</Link>
                </li>
                <li>
                   <Link to="/contact">Contact</Link>
                </li>
            </ul>
            <hr/>
           
            <Routes>
                <Route path='/' element={<Home />}/>
                <Route path='/about' element={<About />}/>
                <Route path='/contact' element={<Contact />}/>
            </Routes>
    
        </div>
    );
}

export default AppRouter