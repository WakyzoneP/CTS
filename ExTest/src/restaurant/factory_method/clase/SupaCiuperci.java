package restaurant.factory_method.clase;

public class SupaCiuperci extends Supa {
    public SupaCiuperci(String denumire, int cantitate) {
        super(denumire, cantitate);
    }

    @Override
    public void descriereSupa() {
        System.out.println (getDenumire() + "are o cantitate de: "+ getCantitate() + " ml. ");
    }
}
