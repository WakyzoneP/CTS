package restaurant.simple_factory.clase;

public class SupaVita extends Supa{
    private int numarKgCarne;
    public SupaVita(String denumire, int cantitate) {
        super(denumire, cantitate);
    }

    public SupaVita(String denumire, int cantitate, int numarKgCarne) {
        super(denumire, cantitate);
        this.numarKgCarne = numarKgCarne;
    }

    @Override
    public void descriereSupa() {
        System.out.println (getDenumire() + "are o cantitate de: "+ getCantitate() + " ml. "+ "si are " + numarKgCarne + " kg ");
    }
}
