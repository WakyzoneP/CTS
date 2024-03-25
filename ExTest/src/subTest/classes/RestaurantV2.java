package subTest.classes;

import java.util.*;

public class RestaurantV2 {
    private Map<Integer, Cuptor> cuptoare;

    public static RestaurantV2 instance = null;

    private RestaurantV2() {
        cuptoare = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            cuptoare.put(i, new Cuptor());
        }
    }

    public static RestaurantV2 getInstance() {
        if (instance == null) {
            instance = new RestaurantV2();
        }
        return instance;
    }

    public void adaugaPreparat(Preparat preparat) {
        List<Cuptor> cuptoareList = new ArrayList<>(cuptoare.values());
        cuptoareList.sort(Comparator.comparing(Cuptor::getTimpTotal));
        cuptoareList.get(0).adaugaPreparat(preparat);
    }

    public void afiseazaPreparate() {
        for (Integer key : cuptoare.keySet()) {
            Cuptor cuptor = cuptoare.get(key);
            System.out.println("Cuptor " + key + " - " + cuptor.getTimpTotal());
            for (Preparat preparat : cuptor.getPreparate()) {
                System.out.println(preparat);
            }
        }
    }
}
