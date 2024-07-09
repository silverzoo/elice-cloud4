import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardShuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> deck = new ArrayList<>();

        //1부터 20까지 순서대로 적혀있는 카드 덱
        for(int i = 1; i <= 20; i++) {
            deck.add(i);
        }

        //셔플
        int num;
        while((num = sc.nextInt()) != -1) {
            int idx = num - 1;
            int card = deck.remove(idx);
            deck.add(card);
        }
        System.out.println(deck.toString());
    }
}
