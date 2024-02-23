import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { getCartProducts, getTotal } from '../redux/reducers';
import Product from './Product';
import { checkout } from '../redux/actions/checkoutAction';

function Cart() {
    const products = useSelector(getCartProducts);
    const total = useSelector(getTotal);
    const dispatch=useDispatch();
    const hasProducts = products.length > 0;
    const nodes = hasProducts ? (
        products.map(product =>
            <Product key={product.id}
                title={product.title}
                price={product.price}
                quantity={product.quantity}
            />
        )
    ) : (
        <em>Please add some product to cart.</em>
    )
   const handleCheckout=()=>{
    dispatch(checkout(products))
   }
  return (
        <div>
            <h3>Your cart</h3>
            <div>{nodes}</div>
            <p>Total: ${total}</p>
            <button onClick={handleCheckout}
            disabled={hasProducts?'': 'disabled'}>Checkout</button>
        </div>
    )
}

export default Cart