package interfaceclass;

import java.util.Arrays;

public class Programmer implements Debuggable {
    String[] techStack = {"Java", "C", "Python"};
    @Override
    public void getTechStack() {
        System.out.println(Arrays.toString(techStack));
    }

    @Override
    public void doProgramming() {
        System.out.println("I'm programming.");
    }

    @Override
    public void doDebugging() {
        System.out.println("I'm debugging.");
    }
}
