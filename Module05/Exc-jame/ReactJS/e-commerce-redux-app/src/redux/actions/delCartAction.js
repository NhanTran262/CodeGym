
import { DEL_ITEM } from "../../constants/delCartConstants"

export const delCart=(product)=>{
    return{
        type: DEL_ITEM,
        payload: product
    }
}