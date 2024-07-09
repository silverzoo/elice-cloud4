import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] answer = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 2},{1, 2},{2, 3}};

        for(int[] query : queries) {
            for(int i = 0; i < answer.length; i++) {
                if(query[0] <= i && i <= query[1]) answer[i]++;
            }
        }

        System.out.println(Arrays.toString(answer));
    }


}