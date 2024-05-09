public class PaymentByCreditCard implements PaymentStrategy {
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        // collect card details
        card = new CreditCard("cardNumber", "ExiryDate", "cvv");
    }

    @Override
    public boolean validatePaymentDetails() {
        // Validate credit card
        if(card.getCvv().equals("cvv")){
            return true;
        }

        return false;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Credit Card");
        card.setAmount(card.getAmount() - amount);
    }
}
