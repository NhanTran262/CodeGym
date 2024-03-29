const canvas = document.getElementById("game");// Thiết lập bối cảnh vẽ với id là game
const ctx = canvas.getContext("2d");

class SnakePart {
    constructor(x, y) {
        this.x = x;
        this.y = y;
    }
}

let speed = 5;

let tileCount = 20; //Số ô vuông con rắn di chuyển
let tileSize = canvas.width / tileCount - 2;
let headX = 10; // Vị trí đầu rắn ở giữa
let headY = 10;
const snakeParts = [];
let tailLength = 2;

let appleX = 5; //Vị trí đầu tiên của mồi
let appleY = 5;

let xVelocity = 0; //Biến vận tốc
let yVelocity = 0;

let score = 0;// Điểm số người chơi

const gulpSound = new Audio("gulp.mp3");// Âm thanh khi rắn đớp mồi

//game loop
function drawGame() {
    changeSnackePosition();
    let result = isGameOver();
    if (result) {
        return;
}

    clearScreen();
    
    checkAppleCollision();
    drawApple();
    drawSnake();
    drawScore();
    if (score > 3) {
        speed = 7;
    }
    if (score > 5) {
        speed = 9;
    }
    if (score > 10) {
        speed = 11
    }

    setTimeout(drawGame, 1000/ speed); //Tốc độ chờ
}

function isGameOver() {
    let gameOver = false;

    if (yVelocity == 0 && xVelocity == 0) {
        return false;
    }

    //walls
    if (headX < 0) {
        gameOver = true;
    }else if (headX === tileCount) {
        gameOver = true;
    }else if (headY < 0) {
        gameOver = true;
    }else if (headY === tileCount) {
        gameOver = true;
    }
//
    for (let i = 0; i < snakeParts.length; i++) {
        let part = snakeParts[i];
        if (part.x === headX && part.y === headY) {
            gameOver = true;
            break;
        }
    }

    if (gameOver) {
        ctx.fillStyle = "white";
        ctx.font = "50px Verdana";
    
        if (gameOver) {
            ctx.fillStyle = "white";
            ctx.font = "50px Verdana";

            var gradient = ctx.createLinearGradient(0, 0, canvas.width, 0);
            gradient.addColorStop("0", "magenta");
            gradient.addColorStop("0.5", "blue");
            gradient.addColorStop("1.0", "red");
            //Fill with gradient
            ctx.fillStyle = gradient;
            ctx.fillText("Game Over!", canvas.width / 6.5, canvas.height / 2);
        }
        ctx.fillText("Game Over!", canvas.width / 6.5, canvas.height / 2);
    }
    return gameOver;
}

function drawScore() {
    ctx.fillStyle = "white";
    ctx.font = "10px Verdana";
    ctx.fillText("Score " + score, canvas.width - 50, 10);
}


function clearScreen() {
    ctx.fillStyle = "black";
    ctx.fillRect(0, 0, canvas.width, canvas.height);
}
//Rắn thêm đuôi
function drawSnake() {
    
    ctx.fillStyle = "green";
    for (let i = 0; i < snakeParts.length; i++) {
        let part = snakeParts[i];
        ctx.fillRect(part.x * tileCount, part.y * tileCount, tileSize, tileSize);
    }

    snakeParts.push(new SnakePart(headX, headY));
    while (snakeParts.length > tailLength) {
        snakeParts.shift();
    }
    ctx.fillStyle = "orange";
    ctx.fillRect(headX * tileCount, headY * tileCount, tileSize, tileSize);
}
//Đổi vị trí rắn
function changeSnackePosition() {
    headX = headX + xVelocity;
    headY = headY + yVelocity;
}
//Tạo mồi
function drawApple() {
    ctx.fillStyle = "red";
    ctx.fillRect(appleX * tileCount, appleY * tileCount, tileSize, tileSize);
}
//Rắn ăn mồi biến mất 
function checkAppleCollision() {
    if (appleX == headX && appleY == headY) {
        appleX = Math.floor(Math.random() * tileCount);
        appleY = Math.floor(Math.random() * tileCount);
        tailLength++;
        score++;
        gulpSound.play();
    }
}

document.addEventListener("keydown", keyDown);

function keyDown(event) {
    //up
    if (event.keyCode == 38) {
        if (yVelocity == 1)// Không cho rắn chạm vào thân
            return;
        yVelocity = -1;
        xVelocity = 0;
    }
    //down
    if (event.keyCode == 40) {
        if (yVelocity == -1)
            return;
      yVelocity = 1;
      xVelocity = 0;
    }
    //left
    if (event.keyCode == 37) {
        if (xVelocity == 1)
            return;
      yVelocity = 0;
      xVelocity = -1;
    }
    //right
    if (event.keyCode == 39) {
        if (xVelocity == -1)
            return;
      yVelocity = 0;
      xVelocity = 1;
    }
    

}

drawGame();

