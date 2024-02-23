import { DELETE_USER } from "../../constants/deleteConstants"

export const deleteUser = (userId) => {
    return {
        type: DELETE_USER,
        payload: userId,
    };
};