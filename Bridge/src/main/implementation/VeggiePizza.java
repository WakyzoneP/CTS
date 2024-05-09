package main.implementation;

public class VeggiePizza extends Pizza {

    @Override
    public void assemble() {
        System.out.println("Adding Sauce: " + sauce);
        System.out.println("Adding Topping: " + topping);
        System.out.println("Adding Cheese");
    }

    @Override
    public void qualityCheck() {
        System.out.println("Crust is: " + crust);
    }
}
