public class PaymentFactory {
    public static PaymentStrategy createPayment(String type) {
        switch (type.toUpperCase()) {
            case "PIX":
                return new PixPayment();
            case "CARTAO":
                return new CreditCardPayment();
            case "BOLETO":
                return new BoletoPayment();
            default:
                throw new IllegalArgumentException("Tipo de pagamento desconhecido: " + type);
        }
    }
}
