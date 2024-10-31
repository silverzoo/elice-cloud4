import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Practice5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N: 행의 개수, M: 열의 개수, K: 쿼리 개수
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 땅값을 저장할 배열과 누적합을 저장할 배열 초기화
        int[][] arr = new int[1001][1001];
        int[][] pSum = new int[1001][1001];

        // 땅값을 입력받고 누적합 계산
        for (int i = 1; i <= n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; ++j) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                pSum[i][j] = pSum[i - 1][j] + pSum[i][j - 1] - pSum[i - 1][j - 1] + arr[i][j];
            }
        }

        StringBuilder sb = new StringBuilder();

        // 각 쿼리에 대해 직사각형 땅값의 합 계산
        for (int i = 1; i <= k; ++i) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            // 누적합 배열을 이용해 직사각형 땅값의 합 계산
            sb.append(pSum[c][d] - pSum[c][b - 1] - pSum[a - 1][d] + pSum[a - 1][b - 1]).append("\n");
        }

        // 결과 출력
        System.out.println(sb.toString());
    }

}