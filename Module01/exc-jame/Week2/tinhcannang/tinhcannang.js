function kiem_tra() {
  let can_nang = document.getElementById("can_nang").value;
  let chieu_cao = document.getElementById("chieu_cao").value;
  let bmi = can_nang / (chieu_cao * chieu_cao);
  let result = "";

  if (bmi < 18.5) result = "Underweight";
  else if (bmi < 25.0) result = "Normal";
  else if (bmi < 30.0) result = "overweight";
  else result = "osebe";
  document.getElementById("result").innerHTML =
    " Chỉ số cân nặng của bạn" + bmi + " . Bạn " + "<b>" + result + "</b>";
}
