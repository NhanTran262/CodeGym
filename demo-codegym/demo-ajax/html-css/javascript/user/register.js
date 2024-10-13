$(document).ready(function () {
    $("#registerForm").submit(function (event) {
    event.preventDefault();
    let username = $("#registerUsername").val();
    let password = $("#registerPassword").val();
    let firstName = $("#registerFirstName").val();
    let lastName = $("#registerLastName").val();
    let citizenIdentification = $("#registerCitizenIdentification").val();
    let dateRange = $("#registerDateRange").val();
    dateRange = transformDate(dateRange);
    let email = $("#registerEmail").val();
    let numberPhone = $("#registerPhoneNumber").val();
    let address = $("#registerAddress").val();

    let registerData = {
        username: username,
        password: password,
        firstName: firstName,
        lastName: lastName,
        citizenIdentification: citizenIdentification,
        dateRange: dateRange,
        email: email,
        phoneNumber: numberPhone,
        address: address
    };
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/api/users/register",
        contentType: "application/json",
        data: JSON.stringify(registerData),
        success: function (response) {
            console.log("Đăng ký thành công:", response);

            let confirmation = confirm("Đăng ký thành công! Bấm OK để đến trang đăng nhập.");

            if (confirmation) {
                window.location.href = "http://127.0.0.1:5500/html/user/login.html";
            }
        },
        error: function () {
            console.error();
            $("#errorContainer").text("Đăng ký không thành công. Vui lòng kiểm tra thông tin và thử lại.");
        }
    });

    function transformDate(dateString) {
        const parts = dateString.split('/');
        if (parts.length === 3) {
            const day = parts[0];
            const month = parts[1];
            const year = parts[2];
            return `${year}-${month}-${day}`;
        }
        return dateString;
    }
});
})

