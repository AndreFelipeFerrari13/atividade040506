import java.util.UUID;

public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String pixCode = UUID.randomUUID().toString();
        System.out.println("Código Pix: " + pixCode);
        System.out.println("Pagamento de R$" + amount + " realizado via Pix.");
    }
}
