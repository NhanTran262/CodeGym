import { put, takeLatest } from "redux-saga/effects"
import { LOGIN, LOGIN_SUCCESS } from "../../constants/loginConstants";
import { FETCH_USER } from "../../constants/userConstants";

function* fakeLogin(action) {
    const user = action.payload;
    if (user.username === "admin" && user.password === "123") {
        alert("Login successfully!!!");
        yield put({
            type: LOGIN_SUCCESS,
            payload: user
        });
        yield put({
            type: FETCH_USER,
            payload: {}
        })
    } else {
        alert("Login failed!")
    }
}
export default function* loginSaga() {
    yield takeLatest(LOGIN, fakeLogin);
}