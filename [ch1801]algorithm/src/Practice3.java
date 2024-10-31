import java.util.Scanner;

class Practice3 {

    // func1 최대공약수 (GCD, Greatest Common Divisor) 계산 함수 정의하기
    static long gcd(long a, long b){

        // 유클리드 알고리즘을 사용해서 GCD를 계산한다.

        while (b != 0){
            // a를 b로 나눈 나머지를 구해서, a에다가 할당하고,
            // b를 a에 다시 할당시킴.
            long temp = a;
            a = b;
            b = temp % b;

        }

        // b가 0이 되면 a가 GCD
        return a; // 최대 공약수

    }

    // func2 최소공배수 (LCM, Least Common Mutilple) 계산 함수 정의하기
    static long lcm(long a, long b){

        // LCM은 두 수의 곱을 GCD로 나눈 값이다.
        return a * b / gcd(a,b);
    }

    public static void main(String[] args) {

        // 입력 받기
        Scanner sc = new Scanner(System.in);


        // 두 정수 N,M 을 입력받게한다.
        long n = sc.nextLong();
        long m = sc.nextLong();

        // 입력받은 두 수의 최대공약수 GCD 와 최소공배수 LCM 계산
        long resultGCD = gcd(n,m);
        long resultLCM = lcm(n,m);

        // 계산결과 출력
        System.out.println(resultGCD + " " + resultLCM);

    }
}
