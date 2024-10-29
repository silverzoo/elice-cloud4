import java.util.Stack;

public class Practice5 {
    public static void main(String[] args) {

        // 지시사항 1. 정수 자료형을 저장하는 스택을 생성합니다.
        Stack<Integer> stack = new Stack<>();

        // 지시사항 2. 스택에 4, 5, 2, 1의 값을 순서대로 넣습니다.
        stack.push(4);
        stack.push(5);
        stack.push(2);
        stack.push(1);

        // 지시사항 3. 스택에 가장 위에 있는 요소를 확인하여 출력합니다.
        stack.peek();

        // 지시사항 4. 스택에 가장 위에 있는 요소를 제거합니다.
        System.out.println(stack.pop());

        // 지시사항 5. 스택이 비어있는지 확인합니다.
        // if(stack.isEmpty()) {
        //     System.out.println(0);
        // } else {
        //     System.out.println(1);
        // }

        System.out.println(stack.isEmpty()? 0 : 1);

        // 지시사항 6. 스택에 남아있는 모든 요소들을 출력 후, 제거합니다.
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // 지시사항 7. 스택에 남아있는 요소의 개수를 확인하여 출력합니다.
        System.out.println(stack.size());
    }
}