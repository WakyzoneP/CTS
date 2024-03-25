import java.util.ArrayList;

public class Erou extends APersonaj {
    private String nume;

    public Erou(String nume) {
        System.out.println();
        this.nume = nume;
        this.listaArme = new ArrayList<>();
        this.listaArme.add(new Arma("Sulita"));
        this.listaArme.add(new Arma("Arc"));
        this.listaArme.add(new Arma("Sabie"));
    }

    @Override
    public void ataca(APersonaj personajAtacat) {
        if (personajAtacat != null && this.listaArme != null && !this.listaArme.isEmpty()) {
            personajAtacat.hp -= 10;
            if (personajAtacat.listaArme != null && !personajAtacat.listaArme.isEmpty()) {
                int indexArma = (int) (Math.random() * personajAtacat.listaArme.size());
                this.listaArme.add(personajAtacat.listaArme.get(indexArma));
                personajAtacat.listaArme.remove(indexArma);
            }
        }
    }

    @Override
    public String toString() {
        return "Erou{" +
                "nume='" + nume + '\'' +
                ", hp=" + hp +
                ", listaArme=" + listaArme +
                ", listaMesaje=" + listaMesaje +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
