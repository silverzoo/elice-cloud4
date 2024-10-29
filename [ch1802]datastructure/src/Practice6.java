import java.util.Queue;
import java.util.LinkedList;

public class Practice6 {
    public static void main(String[] args) {

        // 지시사항 1. 정수 자료형을 저장하는 큐를 생성합니다.
        Queue<Integer> queue = new LinkedList<>();

        // 지시사항 2. 큐에 4, 5, 2, 1의 값을 순서대로 넣습니다.
        queue.add(4);
        queue.add(5);
        queue.add(2);
        queue.add(1);

        // 지시사항 3. 큐에 가장 앞에 있는 요소를 확인하여 출력합니다.
        System.out.println(queue.peek());

        // 지시사항 4. 큐에 가장 앞에 있는 요소를 제거합니다.
        queue.poll();

        // 지시사항 5. 큐가 비어있는지 확인합니다. 비어있다면 0을 출력하고, 비어있지 않다면 1을 출력합니다.
        System.out.println(queue.isEmpty() ? 0 : 1);


        // 지시사항 6. 큐에 남아있는 모든 요소들을 순서대로 한 줄에 하나씩 출력 후, 제거합니다.
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // 지시사항 7. 큐에 남아있는 요소의 개수를 확인하여 출력합니다.
        System.out.println(queue.size());
    }
}