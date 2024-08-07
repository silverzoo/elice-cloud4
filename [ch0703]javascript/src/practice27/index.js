function myFunction() {
    let text = document.createElement("p");
    text.innerHTML = "이것이 추가될 문장입니다."
    let mydiv = document.getElementById("myDiv");
    mydiv.appendChild(text);
}