package restaurant.simple_factory.clase;

public class SupaFactory {

    public Supa creazaSupa(TipSupa tipSupa, String denumire, int cantitate) {
        switch (tipSupa) {
            case SupaVita:
                return new SupaVita(denumire, cantitate);
            case SupaCiuperci:
                return new SupaCiuperci(denumire, cantitate);
            case SupaLegume:
                return new SupaLegume(denumire, cantitate);
            default:
                return null;
        }
    }

    public Supa creazaSupa2(TipSupa tipSupa, String denumire, int cantitate, int numarKgCarne) {
        switch (tipSupa) {
            case SupaVita:
                return new SupaVita(denumire, cantitate, numarKgCarne);
            default:
                return creazaSupa(tipSupa, denumire, cantitate);
        }
    }
}
