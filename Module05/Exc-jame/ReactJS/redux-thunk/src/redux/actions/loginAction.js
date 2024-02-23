import { LOGIN_SUCCESS } from "../../constants/loginConstant";
import { getUsers } from "./userAction";
export const fakeLogin = (payload) => {
    return async (dispatch) => {
        const { username, password } = payload;
        if (username === "admin" && password === "123") {
            dispatch({
                type: LOGIN_SUCCESS,
                payload,
            });
            dispatch(getUsers());
        } else {
            alert("Login Failed");
        }
    };
};