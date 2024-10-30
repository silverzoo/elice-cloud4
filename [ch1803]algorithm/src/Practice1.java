import java.util.Scanner;

class Practice1 {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자로부터 입력을 받을 준비를 함
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 정수 n을 입력받음 (배열의 크기)
        int n = sc.nextInt();

        // 정수형 배열 arr을 크기 n으로 초기화
        int[] arr = new int[n];

        // for문을 이용해 배열의 각 요소에 사용자 입력을 저장
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 배열 arr에 입력된 숫자를 차례대로 저장
        }

        // 가장 큰 값을 찾기 위한 변수 mx를 초기화
        int mx = 0;

        // 배열의 두 요소를 곱하여 최댓값을 찾는 이중 for문
        for (int i = 0; i < n; i++) { // 첫 번째 요소 선택 반복문
            for (int j = i + 1; j < n; j++) { // 두 번째 요소 선택 반복문 (중복 방지를 위해 i+1부터 시작)

                // Math.max를 이용해 현재 최댓값(mx)과 두 요소의 곱을 비교하고 더 큰 값을 mx에 저장
                mx = Math.max(mx, arr[i] * arr[j]);
            }
        }

        // 최종적으로 mx에 저장된 최댓값을 출력
        System.out.println(mx);
    }

}