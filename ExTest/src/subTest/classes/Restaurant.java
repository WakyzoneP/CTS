package subTest.classes;

public class Restaurant {
    private Cuptor cuptor;

    public static Restaurant instance = null;

    private Restaurant() {
        cuptor = new Cuptor();
    }

    public static Restaurant getInstance() {
        if (instance == null) {
            instance = new Restaurant();
        }
        return instance;
    }

    public Cuptor getCuptor() {
        return cuptor;
    }

    public void adaugaPreparat(Preparat preparat) {
        cuptor.adaugaPreparat(preparat);
    }

    public void scoatePreparat(Preparat preparat) {
        cuptor.scoatePreparat(preparat);
    }

    public void afiseazaPreparate() {
        for (Preparat preparat : cuptor.getPreparate()) {
            System.out.println(preparat);
        }
    }
}
