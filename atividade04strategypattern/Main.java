import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // menu de opções de pagamento
        System.out.println("Escolha o método de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");

        // captura a escolha do usuário
        int choice = scanner.nextInt();
        scanner.nextLine();  // Limpa o buffer de entrada

        //solicita o valor da transação
        System.out.print("Digite o valor da transação: R$ ");
        double amount = scanner.nextDouble();

        PaymentStrategy paymentStrategy = null;

        // escolha do pagamento do usuario
        switch (choice) {
            case 1:
                paymentStrategy = new PixPayment();
                break;
            case 2:
                paymentStrategy = new CreditCardPayment();
                break;
            case 3:
                paymentStrategy = new BoletoPayment();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        // estratégia escolhida e executa o pagamento
        PaymentProcessor processor = new PaymentProcessor(paymentStrategy);
        processor.executePayment(amount);
    }
}