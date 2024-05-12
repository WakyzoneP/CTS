package proxy;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class VizitaProxy implements ISpital {
    private final Spital spital = new Spital();

    @Override
    public void inregistrareVizita(Vizita vizita) {
        List<Vizita> programVizitaPacienti = spital.getProgramVizitaPacienti();
        String numePacient = vizita.getPacient();
        Vizita programare = programVizitaPacienti.stream()
                .filter(v -> v.getPacient().equals(numePacient))
                .findFirst()
                .orElse(null);
        if (programare != null && programare.getData().equals(vizita.getData())) {
            System.out.println("Numar maxim de vizite atins pentru pacientul - " + numePacient + " - in ziua "
                    + vizita.getData().toString());
            return;
        }

        System.out.println("Vizita adaugata pentru pacientul - " + numePacient + " - in ziua "
                + vizita.getData().toString());
        spital.inregistrareVizita(vizita);
    }

}
