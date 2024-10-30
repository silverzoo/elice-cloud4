import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        // |o|o|o|
        // 초기화 작업
        int currentSum = 0;
        for (int i = 0; i < m; i++) {
            // 0,1,2
            currentSum += a.get(i);
        }



        int maxSum = currentSum;
        // 4 + (- 3) + 1 = 2
        // |o|o|o|
        //   |o|o|o|

        for (int i = 1; i < n - m + 1; i++) {

            // |o|o|o| - |o| = |o|o|
            // |o|o| + |o| = |o|o|o|
            //   |o|o|o|

            currentSum = currentSum - a.get(i - 1) + a.get(i + m - 1);
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            // System.out.println("인덱스번호 : "+i);
        }
        System.out.println(maxSum);
    }
}
