import { LOGIN, LOGIN_SUCCESS } from "../../constants/loginConstant";

const initialState = {
    userLoggedIn: {},
};
const loginReducer = (state = initialState, action)=>{
    switch (action.type) {
        case LOGIN_SUCCESS:
            return {
                ...state,
                userLoggedIn: action.payload
            };
    }
    return state;
};
export const selectUserLoggedIn = (state) => state.login.userLoggedIn;
export default loginReducer;