import java.util.Scanner;

class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long[] dp = new long[n + 1];

        // 초기값 설정
        dp[1] = 1;
        if (n > 1) dp[2] = 1;

        // DP를 사용해 피보나치 수를 계산
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[n]);
        scanner.close();
    }
}