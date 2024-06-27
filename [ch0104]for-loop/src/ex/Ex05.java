package ex;

import java.util.Scanner;

public class Ex05 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        // 지시사항을 참고하여 코드를 작성하세요.
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) System.out.println(i);
        }

    }
}
