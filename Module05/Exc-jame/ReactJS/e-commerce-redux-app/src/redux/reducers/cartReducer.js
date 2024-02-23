import { ADD_ITEM } from "../../constants/addCartConstants";
import { DEL_ITEM } from "../../constants/delCartConstants";

const cart = [];

const cartReducer = (state = cart, action) => {
    const product = action.payload;
    const exist = state.find((item) => item.id === product.id);
    switch (action.type) {
        case ADD_ITEM:
            if (exist) {
                return state.map((item) =>
                    item.id === product.id ? { ...item, quantity: item.quantity + 1 } : item
                );
            } else {
                return [
                    ...state,
                    {
                        ...product,
                        quantity: 1
                    }
                ]
            }
            break;
        case DEL_ITEM:
            if (exist.quantity === 1) {
                return state.filter((item) => item.id !== exist.id);
            } else {
                return state.map((item) =>
                    item.id === product.id ? { ...item, quantity: item.quantity - 1 } : item
                );
            }
            break;
        default:
            return state;
            break;
    }
}
export default cartReducer;