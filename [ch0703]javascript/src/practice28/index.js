// 1.‘Home’이라고 적힌 <li> 태그를 생성하세요.
let li = document.createElement("li");
li.textContent = "Home";
//다른방법1.
//li.innerHTML = "Home";
//다른방법2.
// let cont1 = document.createTextNode("Home");
// li.appendChild(cont1);


// 2.insertBefore()를 사용해서 menu의 <li> 태그 앞에 'Home'을 삽입하세요.
let menu = document.getElementById("menu");

//이미 기존 자식이 있다면 null이 아님 -> true 반환
if (menu.firstElementChild) menu.insertBefore(li, menu.firstElementChild);
else menu.appendChild(li);


// 3. insertBefore()를 사용해서 calendar의 첫 번째 child로 예약 알람 문구를 삽입하세요.
let alram = document.createElement("div");
//태그까지 추가해야할때는 innerHTML을 사용하는 것이 편함
alram.innerHTML = "<strong>안녕하세요!</strong> 예약하신 날짜입니다.";
let calendar = document.getElementById("calendar");
calendar.insertBefore(alram, calendar.firstElementChild);


// // 4. removeChild()를사용해서 'Contact'라고 적힌 <li> 태그를 삭제하세요.
var items = menu.getElementsByTagName('li');

for (let item of items) {
    if (item.textContent === "Contact") {
        menu.removeChild(item);
        break;
    }
}
//menu.removeChild(menu.lastElementChild);