package ex;

public class Ex09 {
    public static void main(String args[]) {
        int [][] data = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {10, 9, 8, 7, 6}, {5, 4, 3, 2, 1}};

        // 이차원 배열에서 length를 사용하면 어떻게 되는지 확인해 보세요.
        System.out.println("data.length : " + data.length);
        System.out.println("data[0].length : " + data[0].length);

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[0].length; j++) {
                // 지시사항 1번을 참고하여 코드를 작성하세요.
                System.out.println(data[i][j]);
            }
        }

        for(int [] loopArr : data) {
            for(int i : loopArr) {
                // 지시사항 2번을 참고하여 코드를 작성하세요.
                System.out.println(i);
            }
        }
    }
}
