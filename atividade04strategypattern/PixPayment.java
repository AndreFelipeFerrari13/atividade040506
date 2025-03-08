import java.util.Random;

public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Random rand = new Random();
        String pixCode = "PIX-" + rand.nextInt(1000000);
        System.out.println("Pagamento via PIX realizado com o código: " + pixCode);
    }
}