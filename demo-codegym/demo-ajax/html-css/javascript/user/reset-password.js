$("#resetPasswordForm").submit(function(event) {
    event.preventDefault();

    let Usernam =  $("#resetUsername").val();
    let numberPhone =  $("#resetNumberPhone").val();
    let newPassword = $("#resetNewPassword").val();

    let resetPasswordData = {
        username: Usernam,
        numberPhone: numberPhone,
        newPassword: newPassword
    };

    $.ajax({
        type: "POST",
        url: "http://localhost:8080/api/users/reset-password",
        contentType: "application/json",
        data: JSON.stringify(resetPasswordData),
        success: function(response) {

            console.log("Reset Password thành công:", response);
            let confirmation = confirm("Đăng ký thành công! Bấm OK để đến trang đăng nhập.");

            if (confirmation) {
                window.location.href = "http://127.0.0.1:5500/html/user/login.html";
            }

        },
        error: function() {
            console.error();
            $("#errorContainer").text("Reset Password không thành công. Vui lòng kiểm tra tên đăng nhập và mật khẩu.");
        }
    });
});
