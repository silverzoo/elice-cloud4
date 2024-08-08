/*지시사항을 따라 작성해주세요*/
var target = document.getElementById("btn");

function changeButtonOnclick() {
    /*지시사항 1번*/
    target.classList.add("changeColor");
    /*지시사항 2번*/
    target.innerText = "버튼 클릭 성공!"
}

/*지시사항 3번*/
target.addEventListener("click", changeButtonOnclick);
