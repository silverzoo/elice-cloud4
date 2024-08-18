package chapter06.엘카데미;

import java.util.Scanner;

public class NewComerDiscountCondition implements DiscountCondition {

    private boolean isSatisfied;

    // 지시사항을 참고하여 아래 코드를 수정해 생성자 주입을 통한 DI를 구현해 보세요.
    // private FixedRateDiscountPolicy discountPolicy = new FixedRateDiscountPolicy(30);

    private DiscountPolicy discountPolicy;

    public NewComerDiscountCondition(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }


    public boolean isSatisfied() {
        return isSatisfied;
    }

    public void checkDiscountCondition() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("신규 회원이신가요? (1)_예 (2)_아니오");
        isSatisfied = "1".equals(scanner.nextLine());
    }

    public int applyDiscount(int price) {
        return discountPolicy.calculateDiscountedPrice(price);
    }
}
