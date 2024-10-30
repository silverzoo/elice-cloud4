import java.util.Scanner;

class Practice3 {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자로부터 입력을 받을 준비를 함
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 정수 n을 입력받음
        int n = scanner.nextInt();

        // 주어진 숫자 n의 백의 자리 숫자와 십의 자리 숫자를 추출하여 합산
        // 1. n / 100: n을 100으로 나눈 몫으로, 백의 자리 숫자를 구함
        // 2. (n % 100) / 10: n을 100으로 나눈 나머지를 10으로 나눈 몫으로, 십의 자리 숫자를 구함
        System.out.println(n / 100 + (n % 100) / 10);
    }
}
