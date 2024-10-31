import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[100001];

        // dp 배열 초기화: 123456789로 설정하여 불가능한 경우를 나타냄
        Arrays.fill(dp, 123456789);

        // 기본적인 경우 설정 (동전 3원과 5원으로 정확히 나눌 수 있는 경우)
        dp[3] = 1;
        dp[5] = 1;

        // 동적 계획을 통해 최소 동전 개수를 계산
        for (int i = 2; i <= 100000; i++) {

            // 5원 동전을 사용하는 경우 최소 값 갱신
            if (i - 5 >= 0 && dp[i - 5] != 123456789) {
                dp[i] = Math.min(dp[i], dp[i - 5] + 1);
            }

            // 3원 동전을 사용하는 경우 최소 값 갱신
            if (i - 3 >= 0 && dp[i - 3] != 123456789) {
                dp[i] = Math.min(dp[i], dp[i - 3] + 1);
            }
        }

        // 입력값 n에 대해 최소 개수 출력, 불가능한 경우 -1 출력
        System.out.println(dp[n] == 123456789 ? -1 : dp[n]);
        sc.close();
    }

}
