/*지시사항을 따라 작성해주세요*/
let inputs = document.getElementsByTagName("input");
let loginButton = document.getElementsByTagName("button")[0];

let id = inputs[0];
let pw = inputs[1];

/*1. 버튼 활성화시키기*/
function activateBtn(e) {
    /* 여기에 작성해주세요 */
    if(id.value !== "" && pw.value !== "") {
        loginButton.classList.add("activatedColor");
        loginButton.classList.remove("deactivatedColor");
    } else {
        loginButton.classList.remove("activatedColor");
        loginButton.classList.add("deactivatedColor");
    }
}

pw.addEventListener("keyup", activateBtn);

/*2. 로그인 성공 여부 나타내기*/
function login() {
    /* 여기에 작성해주세요 */
    if(id.value === "elice" && pw.value === "1234") {
        alert('로그인 성공');
    }
    else {
        // alert('로그인 성공');
        // 응용
        if(id.value === "elice" && pw.value !== "1234") {
            alert('로그인 실패: 비밀번호를 다시 입력하세요.');
            pw.value = "";
        } else if(id.value !== "elice" && pw.value === "1234") {
            alert('로그인 실패: 아이디를 다시 입력하세요.');
            id.value = "";
        } else {
            alert('로그인 실패: 아이디와 비밀번호 모두 다시 입력하세요');
            id.value = "";
            pw.value = "";
        }

    }
}

loginButton.addEventListener("click", login);
