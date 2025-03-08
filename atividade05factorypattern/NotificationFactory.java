public class NotificationFactory {
    // cria instâncias de notificações 
    public static Notification createNotification(String type) {
        if (type == null) {
            return null;
        }

        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                return null;
        }
    }
}