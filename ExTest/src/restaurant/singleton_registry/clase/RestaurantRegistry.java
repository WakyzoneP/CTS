package restaurant.singleton_registry.clase;


import java.util.HashMap;
import java.util.Map;

public class RestaurantRegistry {
    private String denumire;
    private int numarAngajati;
    private static Map<String, RestaurantRegistry> registru = new HashMap<>();

    private RestaurantRegistry(String denumire, int numarAngajati) {
        this.denumire = denumire;
        this.numarAngajati = numarAngajati;
    }

    public static RestaurantRegistry getInstanta(String denumire) {
        if (!RestaurantRegistry.registru.containsKey(denumire)) {
            RestaurantRegistry.registru.put(denumire, new RestaurantRegistry(denumire, 0));
        }
        return RestaurantRegistry.registru.get(denumire);
    }

    public static void adaugareRestaurant(String denumire, int numarAngajati) {
        if (!RestaurantRegistry.registru.containsKey(denumire)) {
            RestaurantRegistry.registru.put(denumire, new RestaurantRegistry(denumire, numarAngajati));
        }
    }

    public static RestaurantRegistry getRestaurant(String denumire) {
        return RestaurantRegistry.registru.get(denumire);
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RestaurantRegistry{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}
