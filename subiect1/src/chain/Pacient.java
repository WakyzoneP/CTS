package chain;

public class Pacient {
    private final String nume;
    private final int stareVitala;

    public Pacient(String nume, int stareVitala) {
        this.nume = nume;
        this.stareVitala = stareVitala;
    }

    public String getNume() {
        return nume;
    }

    public int getStareVitala() {
        return stareVitala;
    }

}
