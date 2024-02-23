import { DELETE_USER_SUCCESS } from "../../constants/deleteConstants"
import { FETCH_USERS_SUCCESS } from "../../constants/userConstants"

const initialState = {
    users: [],
}
const deleteReducer = (state = initialState, action) => {
    switch (action.type) {
        case DELETE_USER_SUCCESS:
            return {
                ...state,
                users: state.users.filter(user => user.id !== action.payload)
            }
    }
    return state;
}
export const selectDeleteUser=(state)=>state.users;
export default deleteReducer;