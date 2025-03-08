import java.util.UUID;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = UUID.randomUUID().toString();
        System.out.println("Código do Boleto: " + boletoCode);
        System.out.println("Pagamento de R$" + amount + " realizado via Boleto.");
    }
}
