//
// // Lấy token từ localStorage
// let token = localStorage.getItem('token');
//
// // Parse token để lấy userId
// let base64Url = token.split('.')[1];
// let base64 = base64Url.replace(/-/g, '+').replace(/_/g, '/');
// let jsonPayload = decodeURIComponent(atob(base64).split('').map(function(c) {
//     return '%' + ('00' + c.charCodeAt(0).toString(16)).slice(-2);
// }).join(''));
//
// let payload = JSON.parse(jsonPayload);
// let userId = payload.sub;
// let token=localStorage.getItem("token")
// let tokenData= JSON.parse(atob(token.split('.')[1]))
// let userId=tokenData.userId
function createNews() {
    let title = $('#title').val();
    let price = $('#price').val();
    let brand = $('#brand').val();
    let carModel = $('#carModel').val();
    let engine = $('#engine').val();
    let year = $('#year').val();
    let fuel = $('#fuel').val();
    let origin = $('#origin').val();
    let gear = $('#gear').val();
    let numberOfSeat = $('#numberOfSeat').val();
    // let user = localStorage.getItem('token');
    let creatNews = {
        // user:user,
        title: title,
        price: price,
        brand: brand,
        carModel: carModel,
        engine: engine,
        year: year,
        fuel: fuel,
        origin: origin,
        gear: gear,
        numberOfSeat: numberOfSeat
    };
    $.ajax({
        headers: {
            'Accept': 'application/json'
        },
        type: "POST",
        data: JSON.stringify(creatNews),
        url: "http://localhost:9090/api/users/news/create",
        contentType: "application/json",
        success: function (data) {
            alert("Đăng tin thành công")
            console.log("Đăng tin thành công")
            window.location.href = "http://127.0.0.1:5501/productDetails.html";
        },
        error: function (error) {
            console.log(error)
            alert("Lỗi")
        }
    });
}

//     $(document).ready(function (){
//         $.ajax({
//             type: "GET",
//             url: "http://localhost:9090/api/users/{id}",
//             success: function (response){
//                 let username=response.username;
//                 let email=response.email;
//                 $('#username').text(username);
//                 $('#email').text(email);
//             },
//             error: function (xhr,status,error){
//                 // console.log(error);
//                 // alert("Lỗi")
//             }
//         })
//     })
//     $(document).ready(function (){
//         $.ajax({
//             method:"GET",
//             url: "http://localhost:9090/api/users/all",
//             success:function (response){
//                 let users =response.users;
//                 let selectElement=$('#user');
//                 $.each(users,function (index,user){
//                     selectElement.append($('<option>', {
//                         value:user.id,
//                         value:user.name
//                     }));
//                 });
//             },
//             error: function (xhr, status,error){
//                 // console.log(error)
//             }
//         })
//     })
// }