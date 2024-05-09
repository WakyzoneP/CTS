package main;

import main.abstractions.AmericanRestaurant;
import main.abstractions.ItalianRestaurant;
import main.abstractions.Restaurant;
import main.implementation.PepperoniPizza;
import main.implementation.VeggiePizza;

public class App {
    public static void main(String[] args) throws Exception {
        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("==========================================");

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();
    }
}
