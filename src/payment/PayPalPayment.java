package payment;

/**
 * Lớp xử lý thanh toán qua ví PayPal.
 * Triển khai chiến lược thanh toán chính và tính năng hoàn tiền.
 */
public class PayPalPayment implements PaymentStrategy, RefundableStrategy {
    /**
     * Xử lý thanh toán qua tài khoản PayPal.
     *
     * @param amount Số tiền giao dịch.
     */
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng PayPal: " + amount);
    }

    /**
     * Xử lý hoàn tiền về tài khoản PayPal.
     *
     * @param amount Số tiền hoàn trả.
     */
    @Override
    public void refund(double amount) {
        System.out.println("Hoàn tiền về tài khoản PayPal: " + amount);
    }
}