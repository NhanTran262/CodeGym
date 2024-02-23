import { FETCH_USER_SUCCESS } from "../../constants/userConstants";

export const getUsers = (payload) => {
    const { response } = payload;
    const users = response.data;
    return { type: FETCH_USER_SUCCESS, payload: users };

}