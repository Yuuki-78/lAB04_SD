package payment;

public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public PaymentService() {}

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Phương thức thanh toán chưa được thiết lập!");
        }
        paymentStrategy.pay(amount);
    }
}