// select 클래스를 가지고 있는 3개의 요소를 가져옵니다.
var el = document.getElementsByClassName("select");

function handleOnclick() {
    //add가 아닌 toggle로 등록하면 on-off 가능
    this.classList.toggle("on"); // 선택된 요소에 on 클래스를 추가
}

// 가져온 3개의 요소에 이벤트를 등록합니다.
el[0].addEventListener("click",handleOnclick);
el[1].addEventListener("click",handleOnclick);
el[2].addEventListener("click",handleOnclick);
