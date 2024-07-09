package arrays;

import java.util.Arrays;

public class BinarySearch {
    public static int solution(int[] input, int target) {

        Arrays.sort(input);
        return Arrays.binarySearch(input, target);
    }

    private BinarySearch() {}
}
