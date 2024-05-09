public class App {
    public static void main(String[] args) throws Exception {
        PaymentService paymentService = new PaymentService();
        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.setCost(10);
        paymentService.processOrder();
    }
}
