public class Practice1 {
    public static void main(String[] args) {
        // 지시사항 1. 크기 10의 배열 arr를 선언합니다.
        int[] arr = new int[10];


        // 지시사항 2. for 반복문을 사용하여 1부터 10까지의 수를 arr 배열에 순서대로 넣습니다.
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }


        // 배열 요소 출력
        for (int i = 0; i < 10; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 지시사항 3. 지시사항에 맞게 데이터를 변경합니다.

        // 배열 내부, 인덱스 3의 값을 10으로 변경
        arr[3] = 10;


        // 배열 내부, 9번째 위치의 값을 7로 변경
        arr[8] = 7;

        // 변경 후, 배열 요소 출력
        for (int i = 0; i < 10; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}