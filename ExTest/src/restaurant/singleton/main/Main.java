package restaurant.singleton.main;

import restaurant.singleton.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant1 = Restaurant.getInstanta("restaurant1", 100);
        Restaurant restaurant2 = Restaurant.getInstanta("restaurant2", 200);
        System.out.println(restaurant1);
        System.out.println(restaurant2);
    }
}
