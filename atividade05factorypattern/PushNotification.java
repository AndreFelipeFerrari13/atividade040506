public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando push notification com a mensagem: " + message);
    }
}