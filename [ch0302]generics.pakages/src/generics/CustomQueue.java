package generics;

import java.util.LinkedList;
import java.util.Queue;

public class CustomQueue<T> {
    private final Queue<T> queue;

    public CustomQueue() {
        queue = new LinkedList<T>();
    }

    public void add(T element) {
        printAction("add");
        queue.add(element);
    }

    public T poll() {
        printAction("poll");
        return queue.poll();
    }

    public int size() {
        printAction("size");
        return queue.size();
    }

    public Boolean isEmpty() {
        printAction("isEmpty");
        return queue.isEmpty();
    }

    private void printAction(String action) {
        System.out.println(action);
    }
}
