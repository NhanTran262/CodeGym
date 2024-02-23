import { FETCH_USERS_SUCCESS } from "../../constants/userConstant";
import axios from "axios";
export const getUsers =()=>{
    return async(dispatch)=>{
        const response = await axios.get(
            "https://jsonplaceholder.typicode.com/users"
        );
        dispatch({
            type: FETCH_USERS_SUCCESS,
            payload: response.data,
        });
    };
};