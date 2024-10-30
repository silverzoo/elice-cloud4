import java.util.Scanner;

class Practice2 {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자로부터 입력을 받을 준비를 함
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 정수 n을 입력받음 (배열의 크기)
        int n = sc.nextInt();

        // long 타입의 배열 arr을 크기 n으로 초기화
        // 큰 숫자를 다루기 위해 int 대신 long 타입을 사용
        long[] arr = new long[n];

        // for문을 통해 배열의 각 요소에 사용자 입력을 저장
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong(); // 배열 arr에 입력된 숫자를 차례대로 저장
        }

        // 배열의 마지막 두 요소의 곱을 구해 result에 저장
        // 이때, 배열의 크기가 2 이상이라는 전제가 필요함
        long result = arr[n - 1] * arr[n - 2];

        // result에 저장된 값을 출력
        System.out.println(result);
    }
}
