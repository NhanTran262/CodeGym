import { applyMiddleware, createStore } from "redux";
import createSagaMiddleware from "redux-saga"
import rootSaga from "../sagas/rootSaga";
import rootReducer from "../redux/reducers/rootReducer";



const saga=createSagaMiddleware();
const store=createStore(rootReducer,applyMiddleware(saga));
saga.run(rootSaga);
export default store;