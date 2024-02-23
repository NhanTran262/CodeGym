import React, { useEffect } from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { Link, useNavigate } from 'react-router-dom';
import { getProductList, selectProductList } from '../../features/product/productSlice';
import { Button } from 'bootstrap';

function ProductList() {
    const dispatch = useDispatch();
    const navigate = useNavigate();
    const products = useSelector(selectProductList);

    const getProducts = () => {
        dispatch(getProductList());
    }
    useEffect(() => {
        getProducts();
    }, [])

    const handleCreate = (event) => {
        event.preventDefault();
        navigate("/product/add")
    }
    return (
        <div className="container" style={{ textAlign: "center" }}>
            <div>
                <h1>Danh sách sản phẩm</h1>

            </div>
            <table className="table" border={2}>
                <thead className="table-warning">
                    <tr>
                        <th>STT</th>
                        <th>Tên sản phẩm</th>
                        <th>Giá</th>
                        <th>Tồn kho</th>
                        <th colSpan={2}>
                            <button type="button"
                                className="btn btn-primary"
                                onClick={handleCreate}>Thêm sản phẩm</button>
                        </th>
                    </tr>
                </thead>
                <tbody>
                    {products?.map((product) => (
                        <tr key={product.id}>
                            <td>{product.id}</td>
                            <td>{product.name}</td>
                            <td>{product.price}</td>
                            <td>{product.stock}</td>
                            <td colSpan={2}>
                                <Link to={`/product/${product.id}`}>
                                    <button className="btn btn-info">Chi tiết</button>
                                </Link>
                                <Link to={`/product/edit/${product.id}`}>
                                    <button className="btn btn-success ms-2">Cập nhật</button>
                                </Link>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}

export default ProductList