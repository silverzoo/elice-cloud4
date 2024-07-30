package practice2;

class OrderService {
    private PaymentService paymentService;

    // 지시 사항을 참고하여 아래 코드를 수정하세요.
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void createOrder() {
        System.out.println("주문을 생성하는 중...");
        paymentService.processPayment();
    }
}
