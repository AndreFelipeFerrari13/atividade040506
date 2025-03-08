public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    // recebe a estratégia de pagamento
    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // método que executa o pagamento
    public void executePayment(double amount) {
        paymentStrategy.processPayment(amount);
    }
}