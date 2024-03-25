package restaurant.singleton_registry.main;

import restaurant.singleton.clase.Restaurant;
import restaurant.singleton_registry.clase.RestaurantRegistry;

public class Main {
    public static void main(String[] args) {


        RestaurantRegistry restaurantRegistry=RestaurantRegistry.getInstanta("restaurant1");

        RestaurantRegistry restaurantRegistry2=RestaurantRegistry.getInstanta("restaurant2");
        RestaurantRegistry restaurantRegistry3=RestaurantRegistry.getInstanta("restaurant2");
        restaurantRegistry.setNumarAngajati(10);
        restaurantRegistry2.setNumarAngajati(20);
        restaurantRegistry3.setNumarAngajati(30);
        System.out.println(restaurantRegistry);
        System.out.println(restaurantRegistry2);
        System.out.println(restaurantRegistry3);

        RestaurantRegistry.adaugareRestaurant("restaurant5", 10);
        RestaurantRegistry.adaugareRestaurant("restaurant5", 20);
        RestaurantRegistry restaurantRegistry1= RestaurantRegistry.getRestaurant("restaurant5");
        System.out.println(restaurantRegistry1);

    }
}
