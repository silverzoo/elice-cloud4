public class ForLoop {
    public static void main(String[] args) {
        // 초기화,조건,증감
        /*
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        */

        //구구단
        for (int i = 1; i <= 9; i++){
            System.out.println();
            for (int j = 2; j <= 9; j++){
                System.out.println(STR."\{i} * \{j} = \{i*j}");
            }
        }
    }
}

