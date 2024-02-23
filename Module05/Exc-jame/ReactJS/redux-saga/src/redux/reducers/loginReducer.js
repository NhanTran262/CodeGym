const initialState = {
    userLoggedIn: {},
};
const loginReducer = (state = initialState, action) => {

}
export const selectUserLoggedIn = (state) => state.login.userLoggedIn;
export default loginReducer;