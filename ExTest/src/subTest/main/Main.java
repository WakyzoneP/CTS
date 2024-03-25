package subTest.main;

import subTest.classes.Preparat;
import subTest.classes.Restaurant;
import subTest.classes.RestaurantV2;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = Restaurant.getInstance();
        restaurant.adaugaPreparat(new Preparat(100, 20));
        restaurant.adaugaPreparat(new Preparat(50, 10));
        restaurant.adaugaPreparat(new Preparat(200, 30));
        restaurant.adaugaPreparat(new Preparat(150, 25));

        restaurant.afiseazaPreparate();

        RestaurantV2 restaurant2 = RestaurantV2.getInstance();
        restaurant2.adaugaPreparat(new Preparat(100, 20));
        restaurant2.adaugaPreparat(new Preparat(50, 10));
        restaurant2.adaugaPreparat(new Preparat(200, 30));
        restaurant2.adaugaPreparat(new Preparat(150, 25));
        restaurant2.adaugaPreparat(new Preparat(300, 35));

        restaurant2.afiseazaPreparate();
    }
}
