import java.util.Scanner;

class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        int result = findZOrder(N, R, C);
        System.out.println(result);
    }

    public static int findZOrder(int n, int r, int c) {

        // 더 이상 분할할 수 없을 때
        if (n == 0) return 0;

        // 현재 배열을 절반으로 나눈 크기
        int half = (int) Math.pow(2, n - 1);
        int quadrantSize = half * half;

        // 1사분면 (왼쪽 위)
        if (r < half && c < half) {
            return findZOrder(n - 1, r, c);

            // 2사분면 (오른쪽 위)
        } else if (r < half && c >= half) {
            return quadrantSize + findZOrder(n - 1, r, c - half);

            // 3사분면 (왼쪽 아래)
        } else if (r >= half && c < half) {
            return 2 * quadrantSize + findZOrder(n - 1, r - half, c);

            // 4사분면 (오른쪽 아래)
        } else {
            return 3 * quadrantSize + findZOrder(n - 1, r - half, c - half);
        }
    }
}