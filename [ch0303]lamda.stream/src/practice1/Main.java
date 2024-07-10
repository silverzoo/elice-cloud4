package practice1;

@java.lang.FunctionalInterface
interface EliceFunctionalInterface {
    void accept(int x);
}

public class Main {
    public static void main(String[] args) throws Exception {

        //익명 객체
        //  EliceFunctionalInterface example = new EliceFunctionalInterface() {
        //      @Override
        //      public void accept(int x) {
        //          int result = x * 5;
        //          System.out.println(result);
        //      }
        //  };

        //람다 표현식.
        //EliceFunctionalInterface example = (x -> System.out.println(x*5));
        //중괄호{}를 사용하여 함수를 정확히 명시한 것 뿐. 두 코드 모두 잘 작동한다.
        EliceFunctionalInterface example = (x) -> {System.out.println(x * 5);};

        example.accept(5);
    }
}
