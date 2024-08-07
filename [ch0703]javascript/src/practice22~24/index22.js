// alert("Hello world!");


// HTML <div> 요소를 선택하도록 코드를 작성하세요
var selectedTagName = document.getElementsByTagName("div");

// 아이디가 “banana"인 요소를 선택하도록 코드를 작성하세요
var selectedId = document.getElementById("banana");

// 클래스가 "vegetable"인 모든 요소를 선택하도록 코드를 작성하세요
var selectedClassNameS = document.getElementsByClassName("vegetable");

// name 속성값이 "red"인 모든 요소를 선택하도록 코드를 작성하세요
var selectedNameS = document.getElementsByName("red");


// 선택된 요소들을 출력합니다.
document.write(selectedTagName);
document.write(selectedId);
document.write(selectedClassNameS);
document.write(selectedNameS);
