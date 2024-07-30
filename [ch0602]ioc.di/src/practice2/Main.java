package practice2;

public class Main {
    public static void main(String[] args) {

        // 지시 사항을 참고하여 아래 코드를 수정하세요.
        PaymentService paymentService = new PaymentService();

        OrderService orderService = new OrderService(paymentService);
        orderService.createOrder();
    }
}

