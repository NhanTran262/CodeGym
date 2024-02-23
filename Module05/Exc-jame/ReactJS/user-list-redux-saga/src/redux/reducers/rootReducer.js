import { combineReducers } from "redux";
import userReducer from "./userReducer";
import deleteReducer from "./deleteReducer";

const rootReducer=combineReducers({
    delete: deleteReducer,
    user: userReducer,
});
export default rootReducer;