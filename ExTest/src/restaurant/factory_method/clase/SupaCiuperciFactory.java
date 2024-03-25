package restaurant.factory_method.clase;

public class SupaCiuperciFactory implements SupaFactory{
    @Override
    public Supa creazasupa(String denumire, int cantitate) {
        return new SupaCiuperci(denumire, cantitate);
    }
}
