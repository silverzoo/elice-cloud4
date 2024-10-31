import java.util.Scanner;
import java.util.Stack;

public class Practice6 {
    public static void main(String[] args) {
        // 사용자 입력을 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 괄호 문자열을 입력받음
        String sentence = scanner.next();

        // 괄호의 짝이 맞는지 확인할 변수 초기화
        boolean flag = true;

        // 괄호를 저장할 스택 생성
        Stack<Character> stack = new Stack<>();

        // 입력받은 문자열의 각 문자를 순회
        for (int k = 0; k < sentence.length(); k++) {
            char c = sentence.charAt(k);

            // 여는 괄호 '('일 경우 스택에 추가
            if (c == '(') {
                stack.push('(');
            }
            // 닫는 괄호 ')'일 경우 스택에서 괄호를 제거
            else if (c == ')') {
                // 스택이 비어있지 않으면 스택에서 여는 괄호를 제거
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                // 스택이 비어있다면 닫는 괄호가 과잉이므로 불균형 표시
                else {
                    flag = false;
                    break;
                }
            }
        }

        // 모든 괄호가 짝을 이룬 경우와 스택이 비어있어야 함
        if (flag && stack.isEmpty()) {
            // 괄호의 짝이 모두 맞으면 "YES" 출력
            System.out.println("YES");
        } else {
            // 그렇지 않으면 "NO" 출력
            System.out.println("NO");
        }
    }
}
