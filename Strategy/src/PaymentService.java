public class PaymentService {
    private int cost;
    private boolean includeDelivery;
    private PaymentStrategy strategy;

    public void processOrder() {
        strategy.collectPaymentDetails();
        ;
        if (strategy.validatePaymentDetails()) {
            strategy.pay(getTotal());
        }
    }

    private int getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setIncludeDelivery(boolean includeDelivery) {
        this.includeDelivery = includeDelivery;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

}
