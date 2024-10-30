import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Practice4 {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자로부터 입력을 받을 준비를 함
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 입력받은 정수 n은 리스트에 추가할 숫자의 개수를 의미함
        int n = scanner.nextInt();

        // long 타입의 숫자들을 저장할 리스트 a를 ArrayList로 초기화
        List<Long> a = new ArrayList<>();

        // for문을 통해 n개의 숫자를 입력받아 리스트 a에 추가
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextLong()); // 리스트에 입력받은 long 타입 숫자를 추가
        }

        // Collections.sort()를 이용해 리스트 a의 요소들을 오름차순으로 정렬
        Collections.sort(a);

        // 정렬된 리스트에서 가장 큰 두 요소를 곱한 값을 출력
        // a.get(n - 2): 두 번째로 큰 요소
        // a.get(n - 1): 가장 큰 요소
        System.out.println(a.get(n - 2) * a.get(n - 1));
    }
}
