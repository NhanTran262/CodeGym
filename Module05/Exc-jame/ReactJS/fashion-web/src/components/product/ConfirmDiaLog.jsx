import React from 'react'

function ConfirmDiaLog(props) {
  return (
    <div className="confirm-dialog">
        <form style={{backgroundColor:"red"}}>
        <p >Bạn có chắc chắn muốn xóa sản phẩm này ?</p>
        <button 
        className="btn btn-success"
        onClick={props.confirm}>Xác nhận</button>
        <button 
        className="btn btn-success ms-2"
        onClick={props.cancel}>Hủy</button>
        </form>
    </div>
  );
}

export default ConfirmDiaLog