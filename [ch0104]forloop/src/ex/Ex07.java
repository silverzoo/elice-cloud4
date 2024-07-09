package ex;

public class Ex07 {
    public static void main(String args[]) {
        // 지시사항 1번을 참고하여 코드를 작성하세요.
        int[] iArray = new int[3];

        // 지시사항 2번을 참고하여 코드를 작성하세요.
        for(int i = 0; i < iArray.length; i++) {
            iArray[i] = i+1;
        }

        System.out.println("iArray[0] : " + iArray[0]);
        System.out.println("iArray[1] : " + iArray[1]);
        System.out.println("iArray[2] : " + iArray[2]);
    }
}
