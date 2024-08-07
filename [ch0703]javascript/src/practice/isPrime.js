/*지시사항을 따라 작성해주세요*/
function sum(limit) {
    var total = 0;

    for(var i = 2; i <= limit; i++) {
        if(isPrime(i)) total += i;
    }
    return total;
}

function isPrime(num) {
    for(var i = 2; i < num; i++) {
        if(num % i === 0){
            return false;
        }
    }
    return true;
}

document.write("1이상 200이하의 소수의 합 = " + sum(200));