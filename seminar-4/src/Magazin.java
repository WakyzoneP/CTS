import java.util.ArrayList;

public class Magazin extends AMagazin {

    Magazin(IPodea podea, float suprafata, int nrIntrari, String denumire) {
        super(podea, suprafata, nrIntrari, denumire);
        listaDecoratiuni = new ArrayList<>();
    }

    @Override
    public void descriere() {
        System.out.println(this.toString());
    }

    @Override
    public float calculGradIncendiu() {
        float grad = 0;
        if (podea.getDuritate() < 7)
            grad++;
        for (IDecoratiuni d : listaDecoratiuni) {
            if (d.getMaterial().equals(ETipMaterial.LEMN))
                grad++;
        }

        return grad;
    }

    @Override
    public void addDecoratiune(IDecoratiuni m) throws ExceptieDecoratiune {
        if (m.getMaterial().equals(ETipMaterial.STICLA) && podea.getDuritate() < 2)
            throw new ExceptieDecoratiune("Podeaua nu suporta decoratiuni din sticla.");

        listaDecoratiuni.add(m);
    }

    @Override
    public String toString() {
        return "Magazin [podea=" + podea + ", listaDecoratiuni=" + listaDecoratiuni + ", suprafata=" + suprafata
                + ", nrIntrari=" + nrIntrari + ", denumire=" + denumire + "]";
    }

}
