package payment;

public interface RefundableStrategy {
    void refund(double amount);
}