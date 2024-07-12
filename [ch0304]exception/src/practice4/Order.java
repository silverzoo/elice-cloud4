package practice4;

public class Order {
    private static final int MAX_CHEESE_ALLOWED = 1000;

    public static void orderCheesePizza(int req) throws ExcessiveCheeseException {
        if(req > MAX_CHEESE_ALLOWED)
            throw new ExcessiveCheeseException("주문 가능한 치즈의 양을 초과하였습니다.", MAX_CHEESE_ALLOWED, req);
        System.out.println("치즈 피자 주문이 성공적으로 완료되었습니다.");
    }
}
