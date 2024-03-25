import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class APersonaj implements Cloneable {
    private UUID id = UUID.randomUUID();
    protected int hp = 100;
    public List<Arma> listaArme;
    protected List<String> listaMesaje;

    public abstract void ataca(APersonaj personajAtacat);

    public static List<String> mesajeStatice;

    static {
        mesajeStatice = new ArrayList<>();
        mesajeStatice.add("Buna");
        mesajeStatice.add("Pa");
        mesajeStatice.add("Ha");
    }

    public APersonaj() {
        System.out.println("Lista comuna mesaje din BD:");
        listaMesaje = mesajeStatice;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        APersonaj personaj = (APersonaj) super.clone();
        personaj.id = UUID.randomUUID();
        List<Arma> listaArmeNoua = new ArrayList<>();
        for (Arma arma : this.listaArme) {
            listaArmeNoua.add((Arma) arma.clone());
        }
        personaj.listaArme = listaArmeNoua;
        return personaj;
    }
}
