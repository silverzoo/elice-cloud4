// 지시사항을 참고하여 코드를 작성하세요.

//1.id가 form, input, answer인 요소를 가져오세요.
var form = document.getElementById("form");
var input = document.getElementById("input");
var answer = document.getElementById("answer");

//2. 가져온 form 요소에 버튼을 클릭할 때 코드가 실행되도록 작성하세요.
var btn = document.getElementById("btn");

btn.addEventListener("click", function(e) {
    //3. input 요소에 있는 값을 answer 요소에 저장하여 출력하세요.
    //form의 기본 동작 방지. 페이지가 새로 고침x
    e.preventDefault();
    answer.innerText = input.value;
    //제출 후 텍스트 박스 초기화
    input.value = "";
});
