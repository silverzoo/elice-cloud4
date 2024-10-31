import java.util.Scanner;

class Practice1 {
    public static void main(String[] args) {

        // Scanner 객체를 생성해서 사용자의 입력을 받자.
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 수를 입력받음
        int T = sc.nextInt();


        // T가 0보다 클때까지만 반복하게 한다 (테스트케이스 수 만큼 반복)

        while (T > 0){
            // 약수의 개수를 저장할 변수를 초기화 (cnt 카운트값 초기화)
            int cnt = 0;

            // 입력받은 정수 n
            int n = sc.nextInt();

            // 1부터 n까지의 수 중에서 n의 약수의 개수를 세기 (반복문)
            // for

            for (int i = 1; i <= n; ++i){
                // i가 n의 약수인지 확인

                if (n % i == 0){
                    // 나누었을때 0으로 떨어지면, 약수가 ok

                    //    System.out.println(n % i);

                    ++cnt;
                }

            }

            // 약수의 개수가 짝수인지 홀수인지 판단. (조건문)
            if (cnt % 2 == 0){
                // 짝수인경우에
                System.out.println("Even");
            } else {
                // 홀수인경우
                System.out.println("Odd");
            }

            // 테스트 케이스 수 감소
            T--;
        }
    }
}