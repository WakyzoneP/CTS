package restaurant.simple_factory.main;

import restaurant.simple_factory.clase.Supa;
import restaurant.simple_factory.clase.SupaFactory;
import restaurant.simple_factory.clase.SupaLegume;
import restaurant.simple_factory.clase.TipSupa;

public class Main {
    public static void main(String[] args) {
        SupaFactory supaFactory = new SupaFactory();
        Supa supaLegume = supaFactory.creazaSupa(TipSupa.SupaLegume, "supa legume ", 10);
        Supa supaCiuperci = supaFactory.creazaSupa(TipSupa.SupaCiuperci, "supa ciuperci ", 20);
        Supa supaVita = supaFactory.creazaSupa(TipSupa.SupaLegume, "supa vita ", 30);
        supaLegume.descriereSupa();
        supaCiuperci.descriereSupa();
        supaVita.descriereSupa();

        Supa supaVitacuCarne= supaFactory.creazaSupa2(TipSupa.SupaVita, "supa vita cu carne ",40,4);
        supaVitacuCarne.descriereSupa();
    }
}
