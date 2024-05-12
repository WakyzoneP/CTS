package proxy;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital {
    private final List<Vizita> programVizitaPacienti = new ArrayList<>();

    public Spital() {
    }

    public List<Vizita> getProgramVizitaPacienti() {
        return programVizitaPacienti;
    }

    @Override
    public void inregistrareVizita(Vizita vizita) {
        programVizitaPacienti.add(vizita);
    }

}
