import shop from "../../api/shop"
import * as types from "../../constants/actionConstants"
export const checkout = products => (dispatch, getState) => {
    const { cart } = getState()
    dispatch({
        type: types.CHECK_OUT_REQUEST
    })
    shop.buyProducts(products, () => {
        dispatch({
            type: types.CHECK_OUT_SUCCESS,
            cart
        })
        // Replace the line above with line below to rollback on failure:
        // dispatch({ type: types.CHECK_OUT_FAILURE, cart })
    })
}