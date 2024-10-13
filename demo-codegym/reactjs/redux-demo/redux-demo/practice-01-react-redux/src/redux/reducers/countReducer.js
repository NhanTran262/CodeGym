import {
  SELECT_COUNT,
  INCREASE_COUNT,
  DECREASE_COUNT,
} from "../../constant/countConstant";

export default function countReducer(state = 0, action) {
  switch (action.type) {
    case SELECT_COUNT:
      return state;
    case INCREASE_COUNT:
      return state + 1;
    case DECREASE_COUNT:
      return state - 1;
    default:
      return state;
  }
}

export const selectCount = (state) => state.count;
