import java.util.ArrayList;

public class Monstru extends APersonaj {

    public Monstru() {
        this.listaArme = new ArrayList<>();
        this.listaArme.add(new Arma("Coada"));
        this.listaArme.add(new Arma("Gheare"));
        this.listaArme.add(new Arma("Colti"));
    }

    @Override
    public void ataca(APersonaj personajAtacat) {
        if (personajAtacat != null && this.listaArme != null && !this.listaArme.isEmpty()) {
            personajAtacat.hp -= 20;
            int randomIndexMessage1 = (int) (Math.random() * this.listaMesaje.size());
            int randomIndexMessage2 = (int) (Math.random() * this.listaMesaje.size());
            this.listaMesaje.add(this.listaMesaje.get(randomIndexMessage1) + this.listaMesaje.get(randomIndexMessage2));
        }
    }

    @Override
    public String toString() {
        return "Monstru{" +
                "hp=" + hp +
                ", listaArme=" + listaArme +
                ", listaMesaje=" + listaMesaje +
                '}';
    }

}
