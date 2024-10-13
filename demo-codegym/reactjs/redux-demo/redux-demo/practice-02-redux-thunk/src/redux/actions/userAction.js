import axios from "axios";
import { FETCH_USERS_SUCCESS } from "../../constant/userConstant";

export const getUsers = () => {
  return async (dispatch) => {
    const response = await axios.get(
      "https://jsonplaceholder.typicode.com/users"
    );
    dispatch({
      type: FETCH_USERS_SUCCESS,
      payload: response.data,
    });
  };
};
