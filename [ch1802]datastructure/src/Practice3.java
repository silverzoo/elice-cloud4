import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {
        // 지시사항 1. 동적 배열 arr를 선언합니다.
        ArrayList<Integer> arr = new ArrayList<>();

        // 지시사항 2. for 반복문을 사용하여 arr 배열에 1부터 10까지의 수를 순서대로 넣습니다.
        for(int i = 1; i <= 10; i++) {
            arr.add(i);
        }


        // 배열 요소 출력
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        // 지시사항 3. arr 배열의 길이를 출력합니다.
        System.out.println("배열의 길이: " + arr.size());

        // 지시사항 4. 지시사항에 맞게 데이터를 삭제합니다.

        // 배열의 맨 뒤 요소 삭제
        arr.remove(arr.size()-1);

        // 배열의 2번째 요소 삭제
        arr.remove(1);

        // 삭제 후, 배열 요소 출력
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        // 지시사항 5. 지시사항에 맞게 데이터를 추가합니다.

        // 배열의 맨 뒤에 데이터 추가
        arr.add(21);

        // 배열의 3번째 위치에 데이터 삽입
        arr.add(2, 30);

        // 추가 후, 배열 요소 출력
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}
