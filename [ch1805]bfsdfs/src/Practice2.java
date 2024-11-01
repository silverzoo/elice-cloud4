import java.util.*;

public class Practice2 {
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
            graph[b].add(a);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        int[] visited = new int[N + 1];
        dfs(1, graph, visited);
    }

    public static void dfs(int now, List<Integer>[] graph, int[] visited) {
        visited[now] = 1;
        System.out.print(now + " ");

        for (int next : graph[now]) {
            if (visited[next] == 0) {
                dfs(next, graph, visited);
            }
        }
    }
}