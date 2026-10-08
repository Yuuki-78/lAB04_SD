package payment;

/**
 * Lớp xử lý thanh toán qua Thẻ tín dụng (Credit Card).
 * Triển khai chiến lược thanh toán chính và tính năng hoàn tiền.
 */
public class CreditCardPayment implements PaymentStrategy, RefundableStrategy {
    /**
     * Xử lý thanh toán qua thẻ tín dụng.
     *
     * @param amount Số tiền giao dịch.
     */
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng thẻ tín dụng: " + amount);
    }

    /**
     * Xử lý hoàn tiền về thẻ tín dụng.
     *
     * @param amount Số tiền hoàn trả.
     */
    @Override
    public void refund(double amount) {
        System.out.println("Hoàn tiền về thẻ tín dụng: " + amount);
    }
}