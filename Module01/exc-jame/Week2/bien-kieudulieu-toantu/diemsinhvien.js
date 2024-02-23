function tinh_diem() {
  var vat_ly = parseFloat(document.getElementById("vat_ly").value);
  var hoa_hoc = parseFloat(document.getElementById("hoa_hoc").value);
  var sinh_hoc = parseFloat(document.getElementById("sinh_hoc").value);
  // Tính điểm tổng và trung bình
  var sum = vat_ly + hoa_hoc + sinh_hoc;
  var average = (vat_ly + hoa_hoc + sinh_hoc) / 3;
  // Hiển thị điểm
  document.getElementById("ket_qua").innerHTML =
    "<P> Điểm tổng: " + sum + "</P>" +
    "<P> Điểm trung bình: " + average.toFixed(2) + "</P>";
}
