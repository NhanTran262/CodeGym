function Addition() {
  let number1 = document.getElementById("num1").value;
  let number2 = document.getElementById("num2").value;
  let reuslt = Number(number1) + Number(number2);
  document.getElementById("result").innerHTML = reuslt;
}
function Subtraction() {
  let number1 = document.getElementById("num1").value;
  let number2 = document.getElementById("num2").value;
  let reuslt = Number(number1) - Number(number2);
  document.getElementById("result").innerHTML = reuslt;
}
function Multiplication() {
  let number1 = document.getElementById("num1").value;
  let number2 = document.getElementById("num2").value;
  let reuslt = Number(number1) * Number(number2);
  document.getElementById("result").innerHTML = reuslt;
}
function Division() {
  let number1 = document.getElementById("num1").value;
  let number2 = document.getElementById("num2").value;
  let reuslt = Number(number1) / Number(number2);
  document.getElementById("result").innerHTML = reuslt;
}
