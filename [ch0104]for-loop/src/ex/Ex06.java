package ex;

import java.util.Scanner;

public class Ex06 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        // 지시사항을 참고하여 코드를 작성하세요.
        boolean success = false;
        int cnt = 1;

        while(cnt <= 5) {
            int password = scanner.nextInt();
            if(password == 1198) {
                success = true;
                break;
            }
            cnt++;
        }

        System.out.println((success)? "탈출 성공" : "탈출 실패");

    }
}
