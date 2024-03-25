package subTest.classes;

import java.util.*;

public class Cuptor {
    private List<Preparat> preparate;

    public Cuptor() {
        preparate = new ArrayList<>();
    }

    public void adaugaPreparat(Preparat preparat) {
        preparate.add(preparat);
    }

    public void scoatePreparat(Preparat preparat) {
        preparate.remove(preparat);
    }

    public List<Preparat> getPreparate() {
        return preparate;
    }

    public void setPreparate(List<Preparat> preparate) {
        this.preparate = preparate;
    }

    public int getTimpTotal() {
        int timpTotal = 0;
        for (Preparat preparat : preparate) {
            timpTotal += preparat.getTimp();
        }
        return timpTotal;
    }
}
