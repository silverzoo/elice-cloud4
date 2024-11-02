import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Practice4 {
    // 미로의 각 위치를 저장하는 배열 (벽 여부를 나타냄)
    static boolean[][] board;
    // 방문 여부를 저장하는 배열
    static boolean[][] visited;
    // 미로의 행(n)과 열(m) 크기
    static int n, m;

    // 주어진 좌표가 미로의 범위를 벗어나는지 검사하는 함수
    static boolean OOB(int x, int y) {
        return 1 <= x && x <= n && 1 <= y && y <= m;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // n: 행의 수, m: 열의 수 입력받기
        n = input.nextInt();
        m = input.nextInt();

        // 보드와 방문 여부 배열 초기화
        board = new boolean[101][101];
        visited = new boolean[101][101];

        // 미로 입력 받기 (1: 갈 수 있는 곳, 0: 갈 수 없는 곳)
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= m; ++j) {
                board[i][j] = input.nextInt() == 1;
            }
        }

        // BFS를 위한 큐 생성 (좌표와 이동 횟수를 저장)
        Queue<int[]> q = new LinkedList<>();
        // 시작 지점 (1, 1)에서 BFS 시작, 이동 횟수는 0부터 시작
        q.add(new int[]{1, 1, 0});
        visited[1][1] = true;

        // BFS 반복문
        while (!q.isEmpty()) {
            // 큐에서 현재 위치와 이동 횟수를 꺼냄
            int[] point = q.poll();
            int x = point[0];
            int y = point[1];
            int cnt = point[2];

            // 현재 위치가 도착 지점이면 이동 횟수 출력 후 종료
            if (x == n && y == m) {
                System.out.println(cnt);
                return;
            }

            // 이동 방향 (우, 하, 좌, 상)
            int[] dx = {0, 1, 0, -1};
            int[] dy = {1, 0, -1, 0};

            // 4방향으로 이동 시도
            for (int i = 0; i < 4; ++i) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 이동한 좌표가 미로의 범위 내에 있고, 방문하지 않았으며, 갈 수 있는 곳일 때
                if (OOB(nx, ny) && !visited[nx][ny] && board[nx][ny]) {
                    // 해당 좌표를 큐에 추가하고 방문 처리
                    q.add(new int[]{nx, ny, cnt + 1});
                    visited[nx][ny] = true;
                }
            }
        }

        // 도착 지점에 도달할 수 없는 경우 -1 출력
        System.out.println(-1);
    }
}
