package restaurant.simple_factory.clase;

public class SupaLegume extends Supa{
    public SupaLegume(String denumire, int cantitate) {
        super(denumire, cantitate);
    }

    @Override
    public void descriereSupa() {
        System.out.println (getDenumire() + "are o cantitate de: "+ getCantitate() + " ml. ");
    }
}
