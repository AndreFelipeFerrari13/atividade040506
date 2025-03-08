import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Faz exibir o menu de opções notifi
        System.out.println("Escolha o tipo de notificação:");
        System.out.println("1: E-mail");
        System.out.println("2: SMS");
        System.out.println("3: Push Notification");

        // Captura o que o usuario escolhe
        int choice = scanner.nextInt();
        scanner.nextLine();  // Limpa entrada

        // Solicita a mensagem
        System.out.print("Digite a mensagem a ser enviada: ");
        String message = scanner.nextLine();

        // escolha da notificação do usuario
        String notificationType = "";
        switch (choice) {
            case 1:
                notificationType = "email";
                break;
            case 2:
                notificationType = "sms";
                break;
            case 3:
                notificationType = "push";
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        //  cria a instância correta para enviar a mensagem
        Notification notification = NotificationFactory.createNotification(notificationType);
        if (notification != null) {
            notification.send(message);
        } else {
            System.out.println("Tipo de notificação inválido.");
        }
    }
}