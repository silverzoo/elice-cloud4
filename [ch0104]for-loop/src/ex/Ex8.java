package ex;

public class Ex8 {
    public static void main(String args[]) {
        // 아래 코드는 문제 해결을 위해 기본적으로 제공되는 코드입니다. 수정하지 마세요!
        int[] iArray = new int[] {1, 5, 3, 43, 31, 65, 8865, 243, 7743, 13245, 9541, 375, 142, 3645, 8357, 2734, 6845, 184835, 2, 1};

        for (int i = 0; i < iArray.length; i++) {
            // 지시사항을 참고하여 코드를 작성하세요.
            if(iArray[i] % 2 == 0) {
                System.out.println(iArray[i]);
                break;
            }
        }
    }
}
