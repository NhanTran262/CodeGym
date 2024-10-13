$(document).ready(function () {
    $("#loginForm").submit(function (e) {
        e.preventDefault();

        let username = $("#loginUsername").val();
        let password = $("#loginPassword").val();

        $.ajax({
            type: "POST",
            url: "http://localhost:8080/api/users/login",
            contentType: "application/json",
            data: JSON.stringify({
                username: username,
                password: password
            }),
            success: function (data, xhr) {
                if (xhr.status === 200) {
                    window.location.href = 'http://127.0.0.1:5500/html/home.html';
                }
            },
            error: function (xhr) {
                if (xhr.status >= 400 && xhr.status < 500) {
                    alert("Lỗi đăng nhập: nếu sự cố vẫn tiếp diễn, hãy liên hệ với chủ sở hữu trang web");
                } else if (xhr.status >= 500) {
                    alert("Lỗi đăng nhập: kiểm tra lại tên đăng nhập và mật khẩu");
                }
            }
        });
    });
});

