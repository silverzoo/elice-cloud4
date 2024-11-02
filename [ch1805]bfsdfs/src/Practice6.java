import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Practice6 {
    // 그래프를 저장하기 위한 인접 리스트 배열
    static ArrayList<Integer>[] graph = new ArrayList[10001];
    // 방문 여부를 저장하는 배열
    static boolean[] visited = new boolean[10001];
    // 노드의 수 (N), 간선의 수 (M), 연결 컴포넌트의 수 (answer)
    static int N, M;
    static int answer;

    // BFS (너비 우선 탐색) 함수
    static void BFS(int x) {
        // 새로운 연결 컴포넌트를 찾았으므로 answer 증가
        answer++;

        // BFS를 위한 큐 생성 및 시작 노드 삽입
        Queue<Integer> q = new LinkedList<>();
        visited[x] = true; // 시작 노드 방문 처리
        q.add(x); // 큐에 시작 노드 추가

        // 큐가 비어있을 때까지 반복
        while (!q.isEmpty()) {
            // 큐에서 현재 노드를 꺼냄
            int node = q.poll();
            // 현재 노드와 연결된 모든 인접 노드 탐색
            for (int next : graph[node]) {
                // 인접 노드가 방문되지 않았다면 큐에 추가하고 방문 처리
                if (!visited[next]) {
                    q.add(next);
                    visited[next] = true;
                }
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

        // 모든 노드에 대해 BFS 수행
        for (int i = 1; i <= N; i++) {
            // 방문하지 않은 노드에 대해서만 BFS 호출 (새로운 연결 컴포넌트)
            if (!visited[i]) {
                BFS(i);
            }
        }

        // 연결 컴포넌트의 수 출력
        System.out.println(answer);

        scanner.close();
    }
}
