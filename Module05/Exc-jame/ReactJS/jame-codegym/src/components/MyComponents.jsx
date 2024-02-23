import React from 'react'
import Welcome from './welcome/Welcome'
import AddComponents from './add-componenets/AddComponents'
import AlertComponent from './alerts/AlertComponent'

function MyComponents() {
  return (
    <div>
      <Welcome name="Nhân đẹp trai" />
      <AddComponents firstNumber={1} secondNumber={2} />
      <AlertComponent text='Cảnh báo! Tài nguyên bạn vừa truy cập không tồn tại.' />
    </div>

  )
}

export default MyComponents