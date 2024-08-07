// 지시사항에 따라 코드를 작성합니다.
function makeIntroducingText(inputA) {
    var name = inputA.lastName + inputA.firstName;
    var age = inputA.age;
    return "안녕하세요, 저의 이름은 " + name + "이고, 나이는 " + age + "살입니다."
}


// 아래 문자열과 숫자 부분을 자유롭게 바꾸어 가며 실행해 보세요.
// 물론 현재 그대로 두어도 무방합니다. 제출 시의 채점과는 무관합니다.
var inputA = {
    firstName: "태환",
    lastName: "박",
    age: 32
};

// 실행 혹은 제출을 위한 코드입니다. 지우거나 수정하지 말아주세요.
module.exports = { inputs: [inputA], func: makeIntroducingText }
