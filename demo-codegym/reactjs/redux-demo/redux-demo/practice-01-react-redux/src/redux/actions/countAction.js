import {
  SELECT_COUNT,
  INCREASE_COUNT,
  DECREASE_COUNT,
} from "../../constant/countConstant";

export const getCount = () => {
  return { type: SELECT_COUNT };
};

export const increaseCount = () => {
  return { type: INCREASE_COUNT };
};

export const decreaseCount = () => {
  return { type: DECREASE_COUNT };
};
