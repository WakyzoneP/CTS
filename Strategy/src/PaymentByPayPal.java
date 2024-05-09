public class PaymentByPayPal implements PaymentStrategy {
    private String email;
    private String password;

    @Override
    public void pay(int amount) {

        // Validate account
        System.out.println("Paying " + amount + " using Credit Card");
    }

    @Override
    public void collectPaymentDetails() {
        // Paypall mail and password...
        email = "user_email";
        password = "password";
    }

    @Override
    public boolean validatePaymentDetails() {
        if (email.equals("user_email") && password.equals("password")) {
            return true;
        }

        return false;
    }
}
