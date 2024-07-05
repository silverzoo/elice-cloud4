package interfaceclass;

public class Main {
    public static void main(String[] args) {
        Programmer pr = new Programmer();
        pr.getTechStack();
        pr.doProgramming();
        pr.doDebugCheck(); //인터페이스의 default 메서드
        pr.doDebugging();
        Debuggable.sayDebug(); //static메서드는 인터페이스(클래스)에 접근제어자를 사용하여 호출해야한다.
    }
}
