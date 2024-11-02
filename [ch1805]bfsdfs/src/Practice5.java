import java.util.ArrayList;
import java.util.Scanner;

public class Practice5 {
    // 그래프를 저장하기 위한 인접 리스트 배열
    static ArrayList<Integer>[] graph = new ArrayList[5001];
    // 방문 여부를 저장하는 배열
    static boolean[] visited = new boolean[5001];
    // 노드의 수 (N), 간선의 수 (M), 방문한 노드의 수 (answer)
    static int N, M;
    static int answer;

    // DFS (깊이 우선 탐색) 함수
    static void DFS(int x) {
        // 현재 노드를 방문했으므로 방문한 노드의 수를 증가
        answer++;
        // 현재 노드를 방문했다고 표시
        visited[x] = true;
        // 현재 노드에 연결된 모든 인접 노드를 탐색
        for (int next : graph[x]) {
            // 인접 노드가 방문되지 않았다면 DFS 재귀 호출
            if (!visited[next]) {
                DFS(next);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 노드의 수 (N)와 간선의 수 (M) 입력 받기
        N = scanner.nextInt();
        M = scanner.nextInt();

        // 그래프 초기화 (각 노드에 대한 인접 리스트 생성)
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력받기 (무방향 그래프)
        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            // x와 y 노드가 서로 연결되어 있음을 저장
            graph[x].add(y);
            graph[y].add(x);
        }

        // DFS 호출 (시작 노드는 1번)
        DFS(1);

        // 방문한 노드 수에서 시작 노드 (1번)를 제외한 값 출력
        System.out.println(answer - 1);

        scanner.close();
    }
}
