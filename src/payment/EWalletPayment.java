package payment;

/**
 * Lớp xử lý thanh toán qua Ví điện tử (E-Wallet).
 * Chỉ triển khai giao dịch thanh toán cơ bản.
 */
public class EWalletPayment implements PaymentStrategy {
    /**
     * Xử lý thanh toán bằng ví điện tử.
     *
     * @param amount Số tiền giao dịch.
     */
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng ví điện tử: " + amount);
    }
}