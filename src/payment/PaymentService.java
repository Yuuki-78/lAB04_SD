package payment;

/**
 * Lớp điều phối luồng thanh toán trong hệ thống (Context Class).
 * Giữ tham chiếu tới một PaymentStrategy và ủy nhiệm việc thanh toán cho Strategy đó.
 */
public class PaymentService {
    /**
     * Chiến lược thanh toán hiện tại đang được cấu hình.
     */
    private PaymentStrategy paymentStrategy;

    /**
     * Khởi tạo dịch vụ thanh toán chưa chọn phương thức ban đầu.
     */
    public PaymentService() {}

    /**
     * Khởi tạo dịch vụ thanh toán với một phương thức cụ thể.
     *
     * @param paymentStrategy Phương thức thanh toán ban đầu.
     */
    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Thay đổi phương thức thanh toán linh hoạt lúc runtime.
     *
     * @param paymentStrategy Phương thức thanh toán mới muốn thiết lập.
     */
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Thực thi quy trình thanh toán.
     *
     * @param amount Số tiền cần xử lý.
     * @throws IllegalStateException Nếu chưa thiết lập phương thức thanh toán trước khi gọi.
     */
    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Phương thức thanh toán chưa được thiết lập!");
        }
        paymentStrategy.pay(amount);
    }
}