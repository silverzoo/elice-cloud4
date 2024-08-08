/*지시사항을 따라 작성해주세요*/

/*1. index.html 파일을 참고해 주어진 변수들 완성시키기*/

const target = document.getElementsByTagName("button")[0]; //올바른 값을 작성해주세요.
const inputName = document.getElementsByTagName("input")[0]; //올바른 값을 작성해주세요.
const attendee = document.getElementById("attendee"); //올바른 값을 작성해주세요.

/*2. 입력받은 이름을 출석부에 나타내기*/

function attend(e) {
    /*여러명 작성 가능하게 응용.*/
    attendee.innerText = attendee.innerText + "\n" + inputName.value;
    e.preventDefault();
}

target.addEventListener("click", attend);
