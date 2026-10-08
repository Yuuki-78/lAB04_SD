package payment;

public class PayPalPayment implements PaymentStrategy, RefundableStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng PayPal: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Hoàn tiền về tài khoản PayPal: " + amount);
    }
}