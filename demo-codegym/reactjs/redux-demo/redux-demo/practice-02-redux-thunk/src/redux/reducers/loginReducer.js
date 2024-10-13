import { LOGIN_SUCCESS } from "../../constant/loginConstant";

const initialState = {
  userLoggedIn: {},
};

const loginReducer = (state = initialState, action) => {
  // eslint-disable-next-line
  switch (action.type) {
    case LOGIN_SUCCESS:
      return { ...state, userLoggedIn: action.payload };
  }

  return state;
};

export const selectUserLoggedIn = (state) => state.login.userLoggedIn;

export default loginReducer;
