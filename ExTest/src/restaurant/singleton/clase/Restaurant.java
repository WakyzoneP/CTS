package restaurant.singleton.clase;

public class Restaurant {
    private String denumire;
    private int numarAngajati;
    private static Restaurant instanta;

    private Restaurant(String denumire, int numarAngajati) {
        this.denumire = denumire;
        this.numarAngajati = numarAngajati;
    }

    public synchronized static Restaurant getInstanta(String nume, int numarAngajati) {
        if (Restaurant.instanta == null) {
            Restaurant.instanta = new Restaurant(nume, numarAngajati);
        }
        return Restaurant.instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Restaurant{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}
