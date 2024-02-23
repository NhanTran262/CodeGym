import { applyMiddleware, createStore } from "redux";
import reducer from "../redux/reducers";
import { thunk } from "redux-thunk";
import { getAllProducts } from "../redux/actions/getProductsAction";

const store =createStore(reducer,applyMiddleware(thunk))
store.dispatch(getAllProducts())
export default store