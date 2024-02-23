const initialState = {
    users: [],
};
const userReducer = (state = initialState, action) => {

}
export const selectUsers = (state) => state.user.users;
export default userReducer;