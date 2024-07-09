import java.util.Scanner;
import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        // main 메소드의 내용은 실행 / 채점을 위한 코드이므로 수정하지 말아주세요.
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        scanner.close();

        //static 메서드를 호출하는 방식이 클래스명.메서드명() 이라길래 이렇게도 가능한지 테스트 해보았다.
        System.out.println(TestBigInteger.solution(first, second));
    }

    public static BigInteger solution(String first, String second) {
        BigInteger height = new BigInteger(first);
        BigInteger sticker = new BigInteger(second);

        //BigInteger.multiply(BigInteger val) - 곱하여 값을 반환하는 BigInteger 클래스의 메서드
        return height.multiply(sticker);
    }
}

