import java.util.Scanner;

public class TestString2 {
    public static void main(String[] args) {
        // main 메소드의 내용은 실행 / 채점을 위한 코드이므로 수정하지 말아주세요.
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        scanner.close();

        System.out.println(solution(first, second));
    }

    public static int solution(String first, String second) {
        first = first.toUpperCase();
        second = second.toUpperCase();

        return (first.contains(second) || second.contains(first))? 1 : 0;
    }
}

