var isBig = false;
var box = document.getElementById("move");

function move() {

    // 코드를 완성시켜 주세요.
    if(isBig) {
        box.style.width = "300px";
        box.style.height = "300px";
        box.style.left = "600px";
        isBig = false;
    } else {
        box.style.width = "600px";
        box.style.height = "600px";
        box.style.left = "300px";
        isBig = true;
    }

};

var btn = document.getElementById("btn");
btn.addEventListener("click", move);