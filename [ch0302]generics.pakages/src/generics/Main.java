package generics;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        CustomQueue<Integer> integerCustomQueue = new CustomQueue<>();
        CustomQueue<String> stringCustomQueue = new CustomQueue<>();

        Queue<Integer> integerQueue = new LinkedList<>();
        Queue<String> stringQueue = new LinkedList<>();

        boolean condition;

        for (int i = 0; i < 10000; i++) {
            condition = integerCustomQueue.isEmpty() == integerQueue.isEmpty();
            condition = condition && integerCustomQueue.size() == integerQueue.size();
            condition = condition && stringCustomQueue.isEmpty() == stringQueue.isEmpty();
            condition = condition && stringCustomQueue.size() == stringQueue.size();

            integerCustomQueue.add(i);
            integerQueue.add(i);

            String string = String.valueOf(i);

            stringCustomQueue.add(string);
            stringQueue.add(string);

            if ( i % 3 == 1) {
                condition = condition && Objects.equals(integerQueue.poll(), integerCustomQueue.poll());
                condition = condition && Objects.equals(stringQueue.poll(), stringCustomQueue.poll());
            }

            if (!condition) {
                throw new RuntimeException();
            }
        }
    }
}
