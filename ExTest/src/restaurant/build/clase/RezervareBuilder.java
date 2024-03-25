package restaurant.build.clase;

public class RezervareBuilder implements IBuilder {

    private Rezervare rezervare;
    private boolean blocat = false;

    public RezervareBuilder() {
        rezervare = new Rezervare(false, false, false, "anonim");
    }

    public RezervareBuilder setStaLaGeam(boolean staLaGeam) {
        if (!blocat) {
            this.rezervare.setStaLaGeam(staLaGeam);
        }
        return this;
    }

    public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
        if (!blocat) {
            this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
        }
        return this;
    }

    public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        if (!blocat) {
            this.rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
        }
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        if (!blocat) {
            this.rezervare.setGenMuzica(genMuzica);
        }
        return this;
    }

    @Override
    public Rezervare build() {
        blocat = true;
        return rezervare;
    }
}
