/*지시사항을 따라 작성해주세요*/

/*1. 함수를 적용할 target 변수 지정하기*/
var target = document.getElementById("scroll-btn");

/*2. 버튼 클릭 시 화면의 최상단으로 이동하기*/
function scrollUp(e) {
    //e를 통해 마우스 좌표 기준으로 위치를 조정할 수 있다.
    window.scrollTo({top:0, left:0, behavior:'smooth'});
}

target.addEventListener("click", scrollUp);
