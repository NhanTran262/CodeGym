import React from 'react'
import { getVisibleProducts } from '../redux/reducers/productReducer'
import ProductItem from "./ProductItem"
import { useDispatch, useSelector } from "react-redux"
import { addToCart } from '../redux/actions/addToCartAction'

const ProductList = () => {
  const products = useSelector(state => getVisibleProducts(state.products));
  const dispatch = useDispatch();
  const dispatchAddToCart = (id) => dispatch(addToCart(id));
  return (
    <div>
      <h3>Products</h3>
      {products.map(product =>
        <ProductItem
          key={product.id}
          product={product}
          onAddToCartClicked={() => dispatchAddToCart(product.id)} />
      )}
    </div>
  )
}

export default ProductList