import React, { useState } from 'react'
import { useDispatch, useSelector } from 'react-redux';
import { useNavigate, useParams } from 'react-router-dom';
import { addProduct, selectProductAdded } from '../../features/product/productSlice';

function AddProduct() {
    const [product, setProduct] = useState({});
    const { productId } = useParams();
    const isCreate = !productId;
    const dispatch = useDispatch();
    const navigate = useNavigate();
    const productAdded = useSelector(selectProductAdded);
    
    const handleChange = (event) => {
        setProduct({
            ...product,
            [event.target.name]: event.target.value,
        })
    }
    const handleSubmit = () => {
        dispatch(addProduct(product));
        setProduct(productAdded);
        alert(
            `${isCreate ? "Create" : "Edit"}product
        ${JSON.stringify(product)} successfully!!!`
        );
        navigate("/");
    }
    const getBackProductList = () => {
        navigate("/")
    }
    return (
        <div style={{ textAlign: "center" }}>
            <h1>Thêm sản phẩm</h1>
            <form className="container" style={{width:"600px"}}                                                            >
                <div className="input-group mb-3">
                    <label className="input-group-text">Tên sản phẩm</label>
                    <input
                        name="name"
                        value={product.name || ""}
                        onChange={handleChange}
                        placeholder="Tên sản phẩm"
                        className="form-control"
                        required
                    />
                </div>
                <div className="input-group mb-3">
                    <label className="input-group-text">Giá</label>
                    <input
                        name="price"
                        type="number"
                        value={product.price || ""}
                        onChange={handleChange}
                        placeholder="Giá"
                        className="form-control"
                        required
                    />
                </div>
                <div className="input-group mb-3">
                    <label className="input-group-text">Tồn kho</label>
                    <input
                        name="stock"
                        type="number"
                        value={product.stock || ""}
                        onChange={handleChange}
                        placeholder="Tồn kho"
                        className="form-control"
                        required
                    />
                </div>
                <div className="input-group mb-3">
                    <label className="input-group-text">Mô tả</label>
                    <textarea
                        name="description"
                        value={product.description || ""}
                        onChange={handleChange}
                        placeholder="Mô tả sản phẩm"
                        className="form-control"
                        required
                    />
                </div>
                <div style={{ textAlign: "left" }}>
                    <button
                        type="button"
                        onClick={handleSubmit}
                        className="btn btn-success"
                    >
                        Thêm mới
                    </button>
                    &nbsp;
                    <button
                        type="button"
                        onClick={getBackProductList}
                        className="btn btn-danger"
                    >
                        Hủy
                    </button>
                </div>
            </form>

        </div>
    )
}

export default AddProduct