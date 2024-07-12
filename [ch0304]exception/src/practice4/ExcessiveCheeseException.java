package practice4;

class ExcessiveCheeseException extends Exception {
    private int maxCheeseAllowed;
    private int requestedCheeseAmount;

    public ExcessiveCheeseException(String message, int max, int req) {
        super(message);
        maxCheeseAllowed = max;
        requestedCheeseAmount = req;
    }

    public String getDetails() {
        return String.format("요청하신 치즈의 양: %d g, 주문 가능한 최대 치즈의 양: %d g",getMaxCheeseAllowed(),getRequestedCheeseAmount());
    }

    public int getMaxCheeseAllowed() {
        return maxCheeseAllowed;
    }

    public int getRequestedCheeseAmount() {
        return requestedCheeseAmount;
    }
}
