// const message = 'Hello world'
//
// // Update header text
// document.querySelector('#header').innerHTML = message
//
// // Log to console
// console.log(message)

//var const
var fruit = "사과"; //타입과 값이 모두 변경가능한 변수
const car = "자동차"; //final 변수 = 상수
console.log(fruit);
console.log(car);

fruit = "바나나";
//car = "자동차"; //Cannot assign to "car" because it is a constant
console.log(fruit);
console.log(car);

//var의 타입변경
console.log(typeof fruit); //string타입
fruit = 2;
console.log(typeof fruit); //number타입

//리스트
fruits = ["바나나","사과","체리"];
console.log(fruit);
console.log(typeof fruits); //object타입
console.log(fruits[0]);
console.log(fruits[1]);
console.log(fruits[2]);

//함수선언
function add(a,b) {
    return a+b;
}
a=3; b=5;
console.log(add(a,b));
a="3"; b="5";
console.log(add(a,b));

var func1 = function add(a,b) {
    return a+b;
}
a=3; b=5;
console.log(func1(a,b));

//객체 선언
var racer = {
    name : '이은주',
    age : 20,
    skills : ["JS", "JAVA", "SQL"]
}
console.log(racer.name + "의 나이는 " + racer.age + "살이고 스킬은 " + racer.skills + "입니다.");

//변수 타입
var unde; //undifined
var empty = null; //null -> 의도적으로 데이터가 없음을 표시
console.log(unde);
console.log(empty);

var isFruit = true;
console.log(isFruit);
console.log(typeof isFruit);

//fruits 리스트 값 변경
console.log(fruits);
fruits.push("딸기"); //맨 뒤에 추가
console.log(fruits);
fruits.unshift("레몬"); //맨 앞에 추가
console.log(fruits);
fruits.shift(); //맨 앞 삭제
console.log(fruits);
fruits.pop(); //맨 뒤 삭제
console.log(fruits);
console.log(fruits.indexOf("바나나"));
fruits.push("바나나");
console.log(fruits.lastIndexOf("바나나"));

//값 비교
console.log(fruits[0] === fruits[3]); // ===: 값과 타입 비교
console.log(fruits[0] == fruits[3]); // ==: 값 비교
