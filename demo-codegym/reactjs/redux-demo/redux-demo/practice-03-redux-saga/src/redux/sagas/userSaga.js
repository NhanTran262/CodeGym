import axios from "axios";
import { put, takeLatest } from "redux-saga/effects";
import { FETCH_USERS, FETCH_USERS_SUCCESS } from "../../constant/userConstant";

const BaseURL = "https://jsonplaceholder.typicode.com/users";

function* getUsers() {
  try {
    const response = yield axios.get(BaseURL);
    // Sau khi lấy được dữ liệu từ fake API
    // Dispatch một action tới reducer kèm theo dữ liệu mà API trả về
    yield put({ type: FETCH_USERS_SUCCESS, payload: response.data });
  } catch (error) {
    console.log("Error - getUsers: ", error);
  }
}

export default function* userSaga() {
  yield takeLatest(FETCH_USERS, getUsers);
}
