import {all} from "redux-saga/effects"
import deleteSaga from "./deleteSaga"
import userSaga from "./userSaga"




export default function* rootSaga(){
    yield all([deleteSaga(), userSaga()]);
}