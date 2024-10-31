import java.util.Scanner;

class Practice2 {
    public static void main(String[] args) {

        // Scanner instance Created
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스의 수 입력 받구요
        int T = scanner.nextInt(); // 1


        // T번 반복 하게함
        for (int t = 0; t < T; ++t){
            // 검사할 숫자 초기화 n 입력 받기
            long N = scanner.nextLong(); // 4

            // N의 제곱근을 계산 하고 정수형으로 변환


            long sqrt_N = (long) Math.sqrt(N); // 2


            // N이 제곱수인지 확인 (제곱근을 제곱해서 N과 같은지 비교)
            // 시간복잡도가 빅 O  루트 N이 된다.


            if (sqrt_N * sqrt_N == N){
                // 제곱수라면 약수의 개수가 홀수이니까 "Odd" 출력
                System.out.println("Odd");
            } else {
                // 그렇지 않다면, 짝수로 판단 하므로 "Even" 출력
                System.out.println("Even");
            }

        }


    }
}
