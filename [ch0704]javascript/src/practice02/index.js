
// 1. 아이디가 "carrot"인 요소를 선택하세요
var carrot_btn = document.getElementById("carrot");

// 2. click 할 시 텍스트를 보여주는 함수를 작성합니다.
//    버튼을 클릭하면 "토끼가 나타났어요!!" 문장을 출력하도록 해보세요

function showText() {
    document.getElementById("text").innerHTML = "토끼가 나타났어요!!";

};

// 3. 선택한 요소에 "click" 이벤트 핸들러를 등록하세요 (이벤트명:"click", 함수이름)
carrot_btn.addEventListener("click", showText) ;  

