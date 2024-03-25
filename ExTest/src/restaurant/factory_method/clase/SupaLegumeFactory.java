package restaurant.factory_method.clase;

public class SupaLegumeFactory implements SupaFactory{

    @Override
    public Supa creazasupa(String denumire, int cantitate) {
        return new SupaLegume(denumire, cantitate);
    }
}
