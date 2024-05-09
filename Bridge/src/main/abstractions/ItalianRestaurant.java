package main.abstractions;

import main.implementation.Pizza;

public class ItalianRestaurant extends Restaurant {
    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setSauce("Oil");
    }

    @Override
    void addTopping() {
        pizza.setTopping(null);
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thin");
    }
}
