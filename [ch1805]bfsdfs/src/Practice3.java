import java.util.Scanner;
import java.util.ArrayList;

class Practice3 {
    static boolean[] visited = new boolean[201];
    static int cnt = 0;
    static ArrayList<Integer>[] v = new ArrayList[201];

    static void dfs(int n) {
        for (int i : v[n]) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        for (int i = 1; i <= n; ++i) {
            v[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();
            v[a].add(b);
            v[b].add(a);
        }

        for (int i = 1; i <= n; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i);
                ++cnt;
            }
        }

        System.out.println(cnt);
    }
}
