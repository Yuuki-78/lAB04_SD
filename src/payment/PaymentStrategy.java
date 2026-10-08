package payment;
/**
 * Interface định nghĩa chiến lược thanh toán chung cho tất cả các phương thức.
 * Đóng vai trò là Strategy trong mẫu thiết kế Strategy Pattern.
 */
public interface PaymentStrategy {
	/**
     * Thực hiện giao dịch thanh toán với số tiền truyền vào.
     *
     * @param amount Số tiền cần thanh toán.
     */
    void pay(double amount);
}