import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um método de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");

        int choice = scanner.nextInt();
        System.out.print("Digite o valor da transação: ");
        double amount = scanner.nextDouble();

        PaymentStrategy paymentStrategy = null;
        switch (choice) {
            case 1:
                paymentStrategy = PaymentFactory.createPayment("PIX");
                break;
            case 2:
                paymentStrategy = PaymentFactory.createPayment("CARTAO");
                break;
            case 3:
                paymentStrategy = PaymentFactory.createPayment("BOLETO");
                break;
            default:
                System.out.println("Opção inválida");
                System.exit(0);
        }

        PaymentProcessor processor = new PaymentProcessor(paymentStrategy);
        processor.executePayment(amount);
    }
}
