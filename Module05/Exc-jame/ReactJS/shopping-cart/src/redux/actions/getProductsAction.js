import { type } from "@testing-library/user-event/dist/type";
import shop from "../../api/shop";
import * as types from "../../constants/actionConstants";
const receiveProducts = products => ({
    type: types.RECEIVE_PRODUCTS,
    products
})

export const getAllProducts=()=>dispatch=>{
    shop.getProducts(products=>{
        dispatch(receiveProducts(products))
    })
}
