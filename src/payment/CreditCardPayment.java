package payment;

public class CreditCardPayment implements PaymentStrategy, RefundableStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng thẻ tín dụng: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Hoàn tiền về thẻ tín dụng: " + amount);
    }
}