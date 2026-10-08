package payment;

/**
 * Lớp xử lý thanh toán qua Chuyển khoản ngân hàng.
 * Chỉ triển khai giao dịch thanh toán cơ bản.
 */
public class BankTransferPayment implements PaymentStrategy {
    /**
     * Xử lý thanh toán bằng chuyển khoản ngân hàng.
     *
     * @param amount Số tiền giao dịch.
     */
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng chuyển khoản: " + amount);
    }
}