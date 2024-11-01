import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        List<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a].add(b);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        bfs(1, graph, N);
    }

    public static void bfs(int start, List<Integer>[] graph, int N) {
        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[N + 1];

        queue.add(start);
        visited[start] = 1;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            System.out.print(now + " ");

            // 인접 노드 탐색
            for (int next : graph[now]) {
                if (visited[next] == 0) {
                    visited[next] = 1;
                    queue.add(next);
                }
            }
        }
    }
}
