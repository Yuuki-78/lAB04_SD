package payment;

/**
 * Interface định nghĩa khả năng hoàn tiền cho các phương thức thanh toán có hỗ trợ.
 * Áp dụng nguyên lý ISP (Interface Segregation Principle) để tách riêng chức năng hoàn tiền.
 */
public interface RefundableStrategy {
    /**
     * Thực hiện hoàn lại số tiền giao dịch cho khách hàng.
     *
     * @param amount Số tiền cần hoàn lại.
     */
    void refund(double amount);
}