package chapter06.엘카데미;

public interface DiscountCondition {

    void checkDiscountCondition();
    int applyDiscount(int price);
    boolean isSatisfied();
}
