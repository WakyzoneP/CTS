package main;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Franciza {
    public static Franciza instance = null;
    private List<Restaurant> restaurante;

    private Franciza() {
        this.restaurante = new ArrayList<>();
    }

    public static Franciza getInstance() {
        if (instance == null) {
            instance = new Franciza();
        }
        return instance;
    }

    public List<Restaurant> getRestaurante() {
        return restaurante;
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurante.add(restaurant);
    }

    public void removeRestaurant(Restaurant restaurant) {
        restaurante.remove(restaurant);
    }

    public Restaurant getRestaurantById(UUID id) {
        for (Restaurant restaurant : restaurante) {
            if (restaurant.getId() == id) {
                return restaurant;
            }
        }
        return null;
    }

    public Restaurant getRestaurantByDenumire(String denumire) {
        for (Restaurant restaurant : restaurante) {
            if (restaurant.getDenumire().equals(denumire)) {
                return restaurant;
            }
        }
        return null;
    }

    public void afiseazaRestaurante() {
        for (Restaurant restaurant : restaurante) {
            System.out.println(restaurant);
        }
    }
}
