package chain;

import java.util.ArrayList;
import java.util.List;

public class Spital {
    public static List<Spital> listaSpitale = new ArrayList<>();
    private final String nume;
    private final TypeSpital tip;
    private int nrLocuri;
    private Handler handler;

    public Spital(String nume, TypeSpital tip, int nrLocuri) {
        this.nume = nume;
        this.tip = tip;
        this.nrLocuri = nrLocuri;
        listaSpitale.add(this);
        handler = new CheckVitalsHandler(this);
        handler.setNextHandle(new CheckLocHandler(this))
                .setNextHandle(new CheckSpitaleHandler());
    }

    public String getNume() {
        return nume;
    }

    public TypeSpital getTip() {
        return tip;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public void preluareCaz(Pacient pacient) {
        handler.handle(pacient);
    }

}
