package main.abstractions;

import main.implementation.Pizza;

public class AmericanRestaurant extends Restaurant {
    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setSauce("Super Secret Recipe");
    }

    @Override
    void addTopping() {
        pizza.setTopping("Everything");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thick");
    }
}
