import { FETCH_USERS_SUCCESS } from "../../constant/userConstant";

const initialState = {
  users: [],
};

const userReducer = (state = initialState, action) => {
  // eslint-disable-next-line
  switch (action.type) {
    case FETCH_USERS_SUCCESS:
      return { ...state, users: action.payload };
  }

  return state;
};

export const selectUsers = (state) => state.user.users;

export default userReducer;
