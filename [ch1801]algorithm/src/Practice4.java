import java.util.Scanner;

class Practice4 {
    public static void main(String[] args) {
        // 사용자 입력을 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 정수 n을 입력받음 (소수를 찾기 위한 최대 범위)
        int n = scanner.nextInt();

        // 소수 여부를 저장할 배열 생성 (크기 1,000,001)
        // arr[i]가 0이면 소수, 0이 아니면 소수가 아님을 의미
        int[] arr = new int[1000001];

        // 에라토스테네스의 체 알고리즘을 이용하여 소수 판별
        for (int i = 2; i <= n; ++i) {
            // arr[i]가 0이면 i는 소수임
            if (arr[i] == 0) {
                // i의 배수들을 모두 소수가 아님으로 표시
                for (int j = 2 * i; j <= n; j += i) {
                    if (arr[j] == 0) {
                        arr[j]++; // 소수가 아닌 수는 값을 증가시킴
                    }
                }
            }
        }

        // 소수의 개수를 세기 위한 변수
        int cnt = 0;

        // 2부터 n까지의 수 중에서 소수인 수를 카운트
        for (int i = 2; i <= n; ++i) {
            if (arr[i] == 0) {
                cnt++; // 소수이면 cnt 증가
            }
        }

        // 소수의 개수를 출력
        System.out.println(cnt);
    }
}
