import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do cartão de crédito (fictício): ");
        String cardNumber = scanner.nextLine();
        System.out.println("Pagamento via Cartão de Crédito no valor de R$ " + amount + " realizado com o número do cartão: " + cardNumber);
    }
}