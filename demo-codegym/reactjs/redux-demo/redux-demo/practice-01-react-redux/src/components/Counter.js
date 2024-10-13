import React from "react";
import { useDispatch, useSelector } from "react-redux";
import {
  increaseCount,
  decreaseCount,
} from "../redux/actions/countAction";
import { selectCount } from "../redux/reducers/countReducer";
// import store from "../app/store";

function Counter() {
  const count = useSelector(selectCount);
  const dispatch = useDispatch();

  console.log("count: " + count);

  return (
    <>
      <div>
        <button
          aria-label="Decrement value"
            // onClick={() => store.dispatch(decreaseCount())}
          onClick={() => dispatch(decreaseCount())}
        >
          -
        </button>
        <span> {count} </span>
        <button
          aria-label="Increment value"
            // onClick={() => store.dispatch(increaseCount())}
          onClick={() => dispatch(increaseCount())}
        >
          +
        </button>
      </div>
    </>
  );
}

export default Counter;
