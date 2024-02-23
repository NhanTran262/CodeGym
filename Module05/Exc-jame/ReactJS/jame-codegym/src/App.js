import logo from './logo.svg';
import './App.css';
import MyComponents from "./components/MyComponents";
import AppComponents from "./components/app-components/AppComponents";
import AppHello from "./components/AppHello";
import AppHome from "./components/AppHome";
import { Alert } from "bootstrap";
import Calculator from "./components/calculator/Calculator";
import Calculater2 from "./components/calculator/Calculater2";
import StudentInfoComponent from "./components/students/StudentInfoComponent";
import AppCondition from "./components/expand-collapse/AppCondition";
import AppSignUp from "./components/sign-up/AppSignUp";
import LoginValidate from "./components/login-validate/LoginValidate";
import LoginValidateFormik from './components/login-validate/LoginValidateFormik';
import AppRouter from './components/router-1/AppRouter';
import AppRouter2 from './components/router-2/AppRouter2';
import AppUser from './components/users/AppUser';
function App() {
  return (
    // <div className="App">
    //   <header className="App-header">
    //     <img src={logo} className="App-logo" alt="logo" />
    //     <p>
    //       Edit <code>src/App.js</code> and save to reload.
    //     </p>
    //     <a
    //       className="App-link"
    //       href="https://reactjs.org"
    //       target="_blank"
    //       rel="noopener noreferrer"
    //     >
    //       Learn React
    //     </a>
    //   </header>
    // </div>
    <div className='App'>     
     {/* <MyComponents/> */}
     {/* <AppComponents/> */}
     {/* <AppHello/> */}
     {/* <AppHome/> */}
     {/* <Calculator/> */}
     {/* <Calculater2/> */}
     {/* <StudentInfoComponent/> */}
     {/* <AppCondition/> */}
     {/* <AppSignUp/> */}
     {/* <LoginValidate/> */}
     {/* <LoginValidateFormik/> */}
     {/* <AppRouter/> */}
     {/* <AppRouter2/> */}
     <AppUser/>
    </div>
  );
}

export default App;
