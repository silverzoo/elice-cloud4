import java.util.Scanner;

class Practice5 {
    // 주어진 문자열이 회문(앞뒤가 같은지)인지 판별하는 함수
    public static boolean isPalindrome(String s) {
        // 문자열의 앞에서부터와 뒤에서부터 비교하여 확인
        for (int i = 0; i < s.length() / 2; i++) {
            // 대칭 위치의 문자가 다르면 회문이 아님
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        // 모든 비교를 통과하면 회문임
        return true;
    }

    // 주어진 정수가 소수(Prime)인지 판별하는 함수
    public static boolean isPrime(int n) {
        // 1은 소수가 아님
        if (n == 1) {
            return false;
        }
        // 2부터 n의 제곱근까지의 수 중에 약수가 있는지 확인
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // 약수가 존재하면 소수가 아님
                return false;
            }
        }
        // 완전 제곱수인 경우도 소수가 아님
        if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n) {
            return false;
        }
        // 위 조건을 모두 통과하면 소수임
        return true;
    }

    public static void main(String[] args) {
        // 사용자 입력을 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 입력받을 숫자의 개수
        int n = scanner.nextInt();
        int count = 0; // 회문이면서 소수인 수의 개수를 세기 위한 변수

        // n개의 숫자를 입력받아 판별
        for (int i = 0; i < n; i++) {
            // 숫자를 문자열 형태로 입력받음
            String num = scanner.next();

            // 해당 숫자가 회문이면서 소수인지 확인
            if (isPalindrome(num) && isPrime(Integer.parseInt(num))) {
                count++; // 조건을 만족하면 카운트 증가
            }
        }

        // 회문이면서 소수인 수의 개수를 출력
        System.out.println(count);
    }
}
