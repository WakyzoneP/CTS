package restaurant.factory_method.clase;

public class SupaVitaFactory implements SupaFactory {
    @Override
    public Supa creazasupa(String denumire, int cantitate) {
        return new SupaVita(denumire, cantitate);
    }

    public Supa creazasupa(String denumire, int cantitate, int numarKgCarne) {
        return new SupaVita(denumire, cantitate, numarKgCarne);
    }
}
