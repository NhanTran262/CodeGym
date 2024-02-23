import axios from "axios";
import { put, takeLatest } from "redux-saga/effects";
import { FETCH_USER, FETCH_USERS_SUCCESS } from "../constants/userConstants";
const BaseURL = "https://jsonplaceholder.typicode.com/users"
function* getUsers() {
    try {
        const response = yield axios.get(BaseURL);
        yield put({ type: FETCH_USERS_SUCCESS })
    } catch (error) {
        console.log("Error-getUsers: ", error);
    }
}
export default function* userSaga(){
    yield takeLatest(FETCH_USER,getUsers);
}