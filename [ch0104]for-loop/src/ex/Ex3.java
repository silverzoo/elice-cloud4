package ex;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //출력할 구구단의 숫자를 입력할 변수

        // 지시사항을 참고하여 코드를 작성하세요.
        for(int i = 1; i <= 9; i++) {
            System.out.println(n * i);
        }
    }
}
