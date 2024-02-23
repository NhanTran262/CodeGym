import { ADD_ITEM } from "../../constants/addCartConstants"

export const addCart = (product) => {
    return {
        type: ADD_ITEM,
        payload: product
    }

}