import { put, takeLatest } from "redux-saga/effects";
import { DELETE_USER, DELETE_USER_FAILED, DELETE_USER_SUCCESS } from "../constants/deleteConstants";
const BaseURL = "https://jsonplaceholder.typicode.com/users"
function* deleteUser(action) {
    try {
        const { userId } = action.payload;
        yield axios.delete(BaseURL / { userId });
        yield put({ type: DELETE_USER_SUCCESS, payload: userId });
    } catch {
        console.log("Error - getUsers: ", error);
        yield put({ type: DELETE_USER_FAILED, payload: error });
    }

}
export default function* deleteSaga() {
    yield takeLatest(DELETE_USER, deleteUser);
}