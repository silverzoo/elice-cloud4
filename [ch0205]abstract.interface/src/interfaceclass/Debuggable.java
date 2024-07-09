package interfaceclass;

public interface Debuggable extends Programmable, testable {
    void doDebugging();
    default void doDebugCheck() {
        System.out.println("Debug checking.");
    }

    static void sayDebug() {
        System.out.println("hello Debug!");
    }
    //java8 이후 default, static 메서드 추가가 가능하다.
}
//인터페이스끼리는 상속이 가능하다.