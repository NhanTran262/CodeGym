import { put, takeLatest } from "redux-saga/effects";
import { FETCH_USER, FETCH_USER_SUCCESS } from "../../constants/userConstants";
import axios from "axios";


const BaseURL="https://jsonplaceholder.typicode.com/users";
function* getUsers(){
    try{
        const response = yield axios.get(BaseURL);
        yield put({
            type:FETCH_USER_SUCCESS,
            payload:response.data
        });
    } catch (error){
        console.log("Error-getUsers: ", error);
    }
}
export default function* userSaga(){
    yield takeLatest(FETCH_USER, getUsers);
}