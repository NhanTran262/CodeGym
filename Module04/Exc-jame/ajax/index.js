function addNewSmartPhone() {
    let producer = $('#producer').val();
    let model = $('#model').val();
    let price = $('#price').val();
    let newSmartPhone = {
        producer: producer,
        model: model,
        price: price
    };
    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: "POST",
        data: JSON.stringify(newSmartPhone),
        url: "http://localhost:8080/api/smartphones",
        success: successHandler
    });
    event.preventDefault();
}

function successHandler() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/api/smartphones",
        success: function (data) {
            let content = '<table id="display-list" border="1"><tr>\n' +
                '<th>Producer</td>\n' +
                '<th>Model</td>\n' +
                '<th>Price</td>\n' +
                '<th>Delete</td>\n' +
                '</tr>'
            for (let i = 0; i < data.length; i++) {
                content += getSmartPhone(data[i]);
            }
            content += "</table>"
            document.getElementById('smartphoneList').innerHTML = content;
            document.getElementById('smartphoneList').style.display = "block"
            document.getElementById('add-smartphone').style.display = "none"
            document.getElementById('display-create').style.display = "block"
            document.getElementById('title').style.display = "block"
        }
    })
}

function displayFormCreate() {
    document.getElementById('smartphoneList').style.display = "block"
    document.getElementById('add-smartphone').style.display = "none"
    document.getElementById('display-create').style.display = "block"
    document.getElementById('title').style.display = "none"
}

function getSmartPhone(smartPhone) {
    return `<tr><td>${smartPhone.producer}</td><td>${smartPhone.model}</td><td>${smartPhone.price}</td>` +
        `<td class="btn"><button class="deleteSmartPhone" onclick="deleteSmartPhone(${smartPhone.id})">Delete</button></td></tr>`
}
function deleteSmartPhone(id){
    $.ajax({
        type:"DELETE",
        url:`http://localhost:8080/api/smartphones/${id}`,
        success: successHandler
    });
}