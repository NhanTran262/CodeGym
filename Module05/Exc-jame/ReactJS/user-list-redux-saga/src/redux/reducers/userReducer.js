import { FETCH_USERS_SUCCESS } from "../../constants/userConstants"

const initialState = {
    users: [],
}
const userReducer = (state = initialState, action) => {
    switch (action.type) {
        case FETCH_USERS_SUCCESS:
            return {
                ...state,
                users: action.payload
            };
    }
    return state;
};
export const selectUsers = (state) => state.user.users;
export default userReducer;