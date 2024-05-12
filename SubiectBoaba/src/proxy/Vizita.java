package proxy;

import java.util.Date;

public class Vizita {
    private final String nume;
    private final Date data;
    private final String pacient;

    public Vizita(String nume, Date data, String pacient) {
        this.nume = nume;
        this.data = data;
        this.pacient = pacient;
    }

    public String getNume() {
        return nume;
    }

    public Date getData() {
        return data;
    }

    public String getPacient() {
        return pacient;
    }

}
