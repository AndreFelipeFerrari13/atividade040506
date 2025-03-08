import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do cartão de crédito: ");
        String cardNumber = scanner.next();
        System.out.println("Pagamento de R$" + amount + " realizado com o cartão " + cardNumber + ".");
    }
}
