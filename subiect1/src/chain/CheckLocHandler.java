package chain;

public class CheckLocHandler extends Handler {
    private Spital spital;

    public CheckLocHandler(Spital spital) {
        this.spital = spital; 
    }

    @Override
    public void handle(Pacient pacient) {
        int locuri = spital.getNrLocuri();
        if (locuri != 0) {
            spital.setNrLocuri(locuri - 1);
            System.out.println(
                    "Se interneza pacinetul: " + pacient.getNume() + ", nr de locuri ramase: " + spital.getNrLocuri());
            return;
        }

        System.out.println("Locuri insuficiente, se cauta in alt spital de stat");
        handleNext(pacient);
    }

}
