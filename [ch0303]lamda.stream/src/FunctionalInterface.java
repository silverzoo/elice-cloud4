//@FunctionalInterface
interface EliceFunctionalInterface {
    void accept(int x);
}

public class FunctionalInterface {
    public static void main(String[] args) throws Exception {

        //익명 객체
        //  EliceFunctionalInterface example = new EliceFunctionalInterface() {
        //      @Override
        //      public void accept(int x) {
        //          int result = x * 5;
        //          System.out.println(result);
        //      }
        //  };

        // 지시 사항에 따라 코드를 작성해 주세요.
        EliceFunctionalInterface example = (x -> System.out.println(x*5));


        example.accept(5);
    }
}
