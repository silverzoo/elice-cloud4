public class Array {
    public static void main(String[] args) {
        int[] data; //선언
        data = new int[3]; //생성

        for(int i : data) {
            System.out.println(i);
        }

        String[] str = new String[3];

        for(String value : str) {
            System.out.println(value);
        }

        //data 0번지 배열에 값을 넣어봅시다
        data[0] = 12;

        for(int i : data) {
            System.out.println(i);
        }
    }
}
