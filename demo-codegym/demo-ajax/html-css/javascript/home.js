//document.addEventListener("DOMContentLoaded", function() {
  //  let token = localStorage.getItem('token');
    //if (token) {
      //  let user = document.getElementById("user");
        //let loginListItem = document.getElementById("loginListItem");
       // loginListItem.classList.add("hidden");
        //user.classList.remove("hidden");

        //let userMenuItem = document.getElementById("user");
        //let subMenu = userMenuItem.querySelector(".sub-menu");
        //let viewRoomsMenuItem = document.getElementById("viewRooms");
        //let addRoomMenuItem = document.getElementById("addRoom");

       // userMenuItem.addEventListener("mouseover", function() {
         //   subMenu.style.display = "block"; // Hiển thị submenu
        //});

        //userMenuItem.addEventListener("mouseout", function() {
          //  subMenu.style.display = "none"; // Ẩn submenu
        //});

        //viewRoomsMenuItem.addEventListener("click", function() {
          //  window.location.href = "http://127.0.0.1:5500/html/room/my-rooms.html";
        //});

       // addRoomMenuItem.addEventListener("click", function() {
         //   window.location.href ="http://127.0.0.1:5500/html/room/add-room.html";
        //});
  //  }
//});

document.addEventListener("DOMContentLoaded", function () {
    let token = localStorage.getItem('token');
    if (token) {
        let user = document.getElementById("user");
        let loginListItem = document.getElementById("loginListItem");
        loginListItem.classList.add("hidden");
        user.classList.remove("hidden");

        let username = getUsernameFromToken(token);
        user.querySelector("a").textContent = "Xin chào " + username;

        user.addEventListener("click", function () {
            localStorage.removeItem('token');
            window.location.href = 'http://127.0.0.1:5500/html/user/login.html';
        });
    }

    let homeLink = document.querySelector('li a[href="http://127.0.0.1:5500/html/home.html"]');
    homeLink.addEventListener("click", function (event) {
        event.preventDefault();
        window.location.href = 'http://127.0.0.1:5500/html/room/add-room.html';
        //http://127.0.0.1:5500/html/home.html';
    });

    let loginLink = document.querySelector('li a[href="http://127.0.0.1:5500/html/user/login.html"]');
    loginLink.addEventListener("click", function (event) {
        event.preventDefault();
        window.location.href = 'http://127.0.0.1:5500/html/user/login.html';
    });
});
function getUsernameFromToken(token) {
    let decodedToken = decodeJWT(token);
    return decodedToken.username;
}

const jwt = require('jsonwebtoken');
function decodeJWT(token) {
    try {

        return jwt.verify(token, 'your-secret-key');
    } catch (error) {
        console.error(error);
        return null;
    }
}

const decodedToken = decodeJWT(token);

if (decodedToken) {
    const username = decodedToken.username;
} else {
    console.error();
}


