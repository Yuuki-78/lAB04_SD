package payment;

/**
 * Lớp Client minh họa việc khởi tạo và chạy thử nghiệm hệ thống thanh toán mới.
 */
public class Main {
    /**
     * Điểm thực thi chính (Entry Point) của chương trình.
     *
     * @param args Tham số truyền từ dòng lệnh (nếu có).
     */
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        // 1. Thanh toán bằng Thẻ tín dụng
        PaymentStrategy creditCard = new CreditCardPayment();
        paymentService.setPaymentStrategy(creditCard);
        paymentService.processPayment(500000);

        // 2. Thanh toán bằng PayPal
        PaymentStrategy payPal = new PayPalPayment();
        paymentService.setPaymentStrategy(payPal);
        paymentService.processPayment(100000);

        // 3. Thanh toán bằng Ví điện tử
        paymentService.setPaymentStrategy(new EWalletPayment());
        paymentService.processPayment(200000);

        // 4. Thanh toán bằng Chuyển khoản ngân hàng
        paymentService.setPaymentStrategy(new BankTransferPayment());
        paymentService.processPayment(1500000);

        // 5. Minh họa ISP: Chỉ thực hiện hoàn tiền đối với phương thức có hỗ trợ
        if (creditCard instanceof RefundableStrategy) {
            ((RefundableStrategy) creditCard).refund(50000);
        }
    }
}