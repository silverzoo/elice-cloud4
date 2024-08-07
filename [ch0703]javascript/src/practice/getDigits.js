// 지시사항에 따라 코드를 작성합니다.
function getDigits(inputA) {
    //문자열 변환 -> 문자로 나눈 배열 -> 문자를 숫자로 변환
    return inputA.toString().split('').map(Number);
}


// 아래 숫자 부분을 자유롭게 바꾸어 가며 실행해 보세요.
// 물론 현재 그대로 두어도 무방합니다. 제출 시의 채점과는 무관합니다.
var inputA = 1100

// 실행 혹은 제출을 위한 코드입니다. 지우거나 수정하지 말아주세요.
module.exports = { inputs: [inputA], func: getDigits }
