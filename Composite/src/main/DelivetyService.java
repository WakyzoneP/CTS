package main;

public class DelivetyService {
    private Box box;

    public DelivetyService() {}

    public void setupOrder(Box... boxes) {
        this.box = new CompositeBox(boxes);
    }

    public double calculateTotalPrice() {
        return box.calculatePrice();
    }
}
