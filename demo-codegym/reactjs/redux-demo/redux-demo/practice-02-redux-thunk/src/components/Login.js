import { useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { useNavigate } from "react-router-dom";
import { fakeLogin } from "../redux/actions/loginAction";
import { selectUserLoggedIn } from "../redux/reducers/loginReducer";

function Login() {
  const navigate = useNavigate();
  const dispatch = useDispatch();
  const [user, setUser] = useState({ username: "", password: "" });
  const userLoggedIn = useSelector(selectUserLoggedIn);

  const setValueForUser = (key, value) => {
    const newVal = { ...user, [key]: value };
    setUser(newVal);
  };

  const login = () => {
    dispatch(fakeLogin(user));
  };

  useEffect(() => {
    if (userLoggedIn.username) {
      navigate("/users");
    }
  }, [userLoggedIn, navigate]);

  return (
    <form>
      <label>User name </label>
      <input
        id="username"
        onChange={(e) => setValueForUser("username", e.target.value)}
        type="text"
      />
      <br />
      <label>Password </label>
      <input
        id="password"
        onChange={(e) => setValueForUser("password", e.target.value)}
        type="password"
      />
      <br />
      <button
        type="button"
        onClick={() => {
          login();
        }}
      >
        Login
      </button>
    </form>
  );
}
export default Login;
