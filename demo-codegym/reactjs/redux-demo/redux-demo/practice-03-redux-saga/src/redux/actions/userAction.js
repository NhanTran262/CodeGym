import { FETCH_USERS_SUCCESS } from "../../constant/userConstant";

export const getUsers = (payload) => {
  const { response } = payload;
  const users = response.data;
  return { type: FETCH_USERS_SUCCESS, payload: users };
};
