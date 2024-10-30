import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SubarraySumFinder {
    private final List<Integer> numbers;
    private final int targetSum;

    public SubarraySumFinder(List<Integer> numbers, int targetSum) {
        this.numbers = numbers;
        this.targetSum = targetSum;
    }

    public int findTargetSumCount() {
        int left = 0, right = 0, sum = numbers.get(0), count = 0;
        int n = numbers.size();

        while (right < n) {
            if (sum == targetSum) {
                count++;
                if (++right < n) sum += numbers.get(right);
            } else if (sum > targetSum && left < right) {
                sum -= numbers.get(left++);
            } else if (sum < targetSum) {
                if (++right < n) sum += numbers.get(right);
            } else if (left == right && ++right < n) {
                sum += numbers.get(right);
            }
        }
        return count;
    }
}

public class Practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        SubarraySumFinder finder = new SubarraySumFinder(a, m);
        System.out.println(finder.findTargetSumCount());
    }
}
