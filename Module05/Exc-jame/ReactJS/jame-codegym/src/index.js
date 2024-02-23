import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import 'bootstrap/dist/css/bootstrap.css';
import { BrowserRouter } from 'react-router-dom';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>
  <React.StrictMode>
    <App />
  </React.StrictMode>
  </BrowserRouter>
);

//Render with craeteElement
// const name = "Your Name"
// root.render(React.createElement(
//   "h1",
//   {
//     style: { textAlign: "center" }
//   },
//   name
// ));

//Render with JSX
// const name2 = "Hoàng Nhân"
// const jsx =
//   <h1 style={{ textAlign: "center" }}>{name2}</h1>
// root.render(jsx)

//Render List  with JSX
// const fruits = ["Apple", "Banana", "Orange", "Kiwi", "Blueberry", "Starberry"]
// const jsx1 =
//   <div>
//     <h1>List of fruits</h1>
//     <ul>
//       {fruits.map((item) => (
//         <li>{item}</li>
//       ))}
//     </ul>
//   </div>
// root.render(jsx1)

//Render Local date
// const jsx2 =
//   <div>
//     <h1>Hello, world!</h1>
//     <h2>It is {new Date().toLocaleTimeString()}</h2>
//   </div>
// const tick = () => {
//   root.render(jsx2)
// };
// setInterval(tick, 100000);

//Render info website
// const jsx3 =
//   <h4>Browser's details:{navigator.userAgent}</h4>
// root.render(jsx3)   

//Render student list
// 

//Render Info Card
// const jsx=
// <div className='container'>
//   <div className='card'>
//     <div className='card--header'/>
//       <img
//       className='avatar'
//       src='https://scontent.fhan4-1.fna.fbcdn.net/v/t1.6435-9/144015851_3739217229637188_3990054816216530030_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=be3454&_nc_ohc=L3JL5Ul-AMcAX-wiFdj&_nc_ht=scontent.fhan4-1.fna&oh=00_AfBM7kViCiTazv-KoXdu4cw9dgJvNqNo3k5xYGjg2ongYQ&oe=659E29CF'
//       alt='avatar'/>
//     <div className='card--body'>
//       <div>
//         <p className='text--header'>Hoang Nhan</p>
//         <p className='text-sub'>
//           Đẹp trai siêu cấp vô địch thủ
//         </p>
//         <button className='btn third'>Follow Me</button>
//       </div>
//     </div>
//   </div>
// </div>
// root.render(jsx)

//Render form login
// const jsx=
// <div className="container d-flex align-items-center text-center">
//     <div className="form-signin">
//       <form>
//         <img className="mb-4" src="https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/Bootstrap_logo.svg/2560px-Bootstrap_logo.svg.png" alt="" width="72" height="57" />
//         <h1 className="h3 mb-3 fw-normal">Please sign in</h1>
//         <div className="form-floating">
//           <input type="email" className="form-control email" id="floatingInput" placeholder="name@example.com" />
//           <label>Email address</label>
//         </div>
//         <div className="form-floating">
//           <input type="password" className="form-control password" id="floatingPassword" placeholder="Password" />
//           <label>Password</label>
//         </div>
//         <div className="checkbox mb-3">
//           <label>
//             <input type="checkbox" /> Remember me
//           </label>
//         </div>
//         <button className="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
//         <p className="mt-5 mb-3 text-muted">© 2017–2021</p>
//       </form>
//     </div>
//   </div>
//   root.render(jsx)

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
