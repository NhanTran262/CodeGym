import React, { useEffect, useState } from 'react'
import { useDispatch, useSelector } from 'react-redux';
import { Link, useNavigate, useParams } from 'react-router-dom'
import { getProduct, removeProduct, selectProductDetail } from '../../features/product/productSlice';
import ConfirmDiaLog from './ConfirmDiaLog';


function ProductDetail() {
    const { productId } = useParams();
    const dispatch = useDispatch();
    const navigate = useNavigate();
    const productDetail = useSelector(selectProductDetail);
    const [confirm, setConfirm] = useState(false)

    const getProductDetail = () => {
        if (productId != null) {
            dispatch(getProduct(productId));
        }
    };

    useEffect(() => {
        getProductDetail();
    }, []);

    const handleRemoveProduct = () => {
        setConfirm(true);
    }
    const confirmRemoveProduct = () => {
        if (productId) {
            dispatch(removeProduct(productId));
            navigate("/")
        }
    }
    return (
        <div>
            <h1 style={{ textAlign: "center" }}>Chi tiết sản phẩm</h1>
            <div className="container">
                <Link to={"/"}>
                    <button className="btn btn-primary ">Danh sách</button>
                </Link>
            </div>
            <hr />
            <div className="container">
                <p>
                    <b style={{ marginRight: "20px" }}>Tên sản phẩm:</b>
                    {productDetail?.name}
                </p>
                <p>
                    <b style={{ marginRight: "95px" }}>Giá:</b>
                    {productDetail?.price}đ
                </p>
                <p>
                    <b style={{ marginRight: "57px" }}>Tồn kho:</b>
                    {productDetail?.stock}
                </p>
                <p>
                    <b style={{ marginRight: "75px" }}>Mô tả:</b>
                    {productDetail?.description}
                </p>
            </div>
            <div className="d-flex justify-content-center">
                <button
                    className="btn btn-danger"
                    type="button"
                    onClick={handleRemoveProduct}>Xóa</button>
                    <hr/>
                {confirm && <ConfirmDiaLog
                            confirm={confirmRemoveProduct}
                            cancel={() => setConfirm(false)} /> 
                }
            </div>



        </div>
    );
}

export default ProductDetail