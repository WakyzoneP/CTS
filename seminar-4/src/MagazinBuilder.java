import java.util.ArrayList;
import java.util.List;

public class MagazinBuilder implements IBuilder {
    private IPodea podea;
    private List<IDecoratiuni> listaDecoratiuni = null;
    private float suprafata;
    private int nrIntrari;
    private String denumire;

    public MagazinBuilder(float suprafata, int nrIntrari, String denumire) {
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.denumire = denumire;
        listaDecoratiuni = new ArrayList<>();
    }

    public MagazinBuilder setPodea(IPodea podea) {
        this.podea = podea;
        return this;
    }

    public MagazinBuilder addDecoratiune(IDecoratiuni m) {
        listaDecoratiuni.add(m);
        return this;
    }

    @Override
    public Magazin build() {

        if (nrIntrari < suprafata / 100)
            return null;

        if (podea.getDuritate() < 2)
            for (IDecoratiuni d : listaDecoratiuni) {
                if (d.getMaterial().equals(ETipMaterial.STICLA))
                    return null;
            }

        Magazin newMagazin = new Magazin(podea, suprafata, nrIntrari, denumire);
        for (IDecoratiuni d : listaDecoratiuni) {
            try {
                newMagazin.addDecoratiune(d);
            } catch (ExceptieDecoratiune e) {
                e.printStackTrace();
            }
        }

        return newMagazin;
    }

}
