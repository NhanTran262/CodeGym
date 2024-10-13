import { BrowserRouter, Routes, Route } from "react-router-dom";
import Login from "./components/Login";
import { Provider } from "react-redux";
import store from "./app/store";
import User from "./components/User";

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
