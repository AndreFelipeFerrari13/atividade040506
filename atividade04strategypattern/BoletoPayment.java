public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = "BOLETO-" + (int) (Math.random() * 1000000);
        System.out.println("Pagamento via Boleto realizado com o código: " + boletoCode);
    }
}