package restaurant.factory_method.main;

import restaurant.factory_method.clase.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SupaLegumeFactory supaLegumeFactory = new SupaLegumeFactory();
        SupaVitaFactory supaVitaFactory = new SupaVitaFactory();
        SupaCiuperciFactory supaCiuperciFactory = new SupaCiuperciFactory();
        Supa supa1 = supaLegumeFactory.creazasupa("supa legume ", 10);
        Supa supa2 = supaVitaFactory.creazasupa("supa vita ", 10);
        Supa supa4 = supaVitaFactory.creazasupa("supa vita ", 10, 3);
        Supa supa3 = supaCiuperciFactory.creazasupa("supa ciuperci ", 10);
        List<Supa> lista = new ArrayList<>();
        lista.addAll(List.of(supa1, supa2, supa3, supa4));
        for (Supa supa : lista) {
            supa.descriereSupa();
        }
    }
}
