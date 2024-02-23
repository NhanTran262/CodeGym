import React, { useEffect, useState } from 'react'
import { useDispatch, useSelector } from 'react-redux';
import { useNavigate, useParams } from 'react-router-dom';
import { editProduct, getProduct, selectProductDetail, selectSuccess } from '../../features/product/productSlice';

function EditProduct() {
    const [product, setProduct] = useState({});
    const { productId } = useParams();
    const isCreate = !productId;
    const dispatch = useDispatch();
    const navigate = useNavigate();
    const productDetail = useSelector(selectProductDetail);
    const success=useSelector(selectSuccess)

    const getProductEditing = async () => {
        if (productDetail == null || productDetail.id !== productId) {
            dispatch(getProduct(productId))
        } else {
            const { id, name, price, stock, description } = productDetail;
            const currentProductDetail = { id, name, price, stock, description };
            setProduct(currentProductDetail);
        }

    };

    useEffect(() => {
        getProductEditing();
    }, [success]);
    
    const handleChange = (event) => {
        setProduct({
            ...product,
            [event.target.name]: event.target.value,
        });
    }
    const handleSubmit = () => {
        dispatch(editProduct(product));
        alert(
            `${isCreate ? "Create" : "Edit"} book 
            ${JSON.stringify(product)} successfully!!!`
        )
        navigate("/");
    }
    const getBackProductList = () => {
        navigate("/");
    }
    return (
        <div style={{ textAlign: "center" }}>
            <h1>Cập nhật sản phẩm</h1>
            <form className="container" style={{width:"600px"}}>
                <div className="input-group mb-3">
                    <label className="input-group-text">Tên sản phẩm</label>
                    <input
                        name="name"
                        value={product?.name || ""}
                        onChange={handleChange}
                        className="form-control"
                        required
                    />
                </div>
                <div className="input-group mb-3">
                    <label className="input-group-text">Giá</label>
                    <input
                        name="price"
                        type="number"
                        value={product?.price || ""}
                        onChange={handleChange}
                        className="form-control"
                        required
                    />
                </div>
                <div className="input-group mb-3">
                    <label className="input-group-text">Tồn kho</label>
                    <input
                        name="stock"
                        type="number"
                        value={product?.stock || ""}
                        onChange={handleChange}
                        className="form-control"
                        required
                    />
                </div>
                <div className="input-group mb-3">
                    <label className="input-group-text">Mô tả</label>
                    <textarea
                        name="description"
                        value={product?.description || ""}
                        onChange={handleChange}
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
                        Cập nhật
                    </button>
                    &nbsp;
                    <button type="button" onClick={getBackProductList} className="btn btn-danger">
                        Hủy
                    </button>
                </div>
            </form>
        </div>
    )
}

export default EditProduct