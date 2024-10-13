import { put, takeLatest } from "redux-saga/effects";
import { LOGIN, LOGIN_SUCCESS } from "../../constant/loginConstant";
import { FETCH_USERS } from "../../constant/userConstant";

function* fakeLogin(action) {
  const user = action.payload;
  if (user.username === "admin" && user.password === "123") {
    alert("Login Successfully!");
    yield put({ type: LOGIN_SUCCESS, payload: user });
    yield put({ type: FETCH_USERS, payload: {} });
  } else {
    alert("Login Failed!");
  }
}

export default function* loginSaga() {
  yield takeLatest(LOGIN, fakeLogin);
}
