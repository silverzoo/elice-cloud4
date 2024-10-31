import java.util.Scanner;

public class Practice1 {
    static int N, M;
    static boolean[] visited;
    static int[] permutation;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        visited = new boolean[N + 1];
        permutation = new int[M];

        backtrack(0);  // 백트래킹 시작
    }

    // 백트래킹 메서드
    public static void backtrack(int depth) {
        if (depth == M) { // M개의 숫자를 선택한 경우 출력
            printPermutation();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) { // 방문하지 않은 숫자만 선택
                visited[i] = true;
                permutation[depth] = i;  // 현재 깊이에 숫자 저장
                backtrack(depth + 1); // 다음 깊이 탐색
                visited[i] = false; // 백트래킹 후 방문 해제
            }
        }
    }

    // 현재 순열 출력 메서드
    public static void printPermutation() {
        StringBuilder sb = new StringBuilder();
        for (int num : permutation) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
