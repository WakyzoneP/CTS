package chain;

public class CheckVitalsHandler extends Handler {
    private Spital spital;

    public CheckVitalsHandler(Spital spital) {
        this.spital = spital; 
    }

    @Override
    public void handle(Pacient pacient) {
        if(pacient.getStareVitala() > 10) {
            System.out.println("Se verifica centralizatorul medicilor de familie pentru programare");
            return;
        }

        if(spital.getTip() == TypeSpital.STAT) {
            System.out.println("Se intervine pentru stabilizarea pacientului");
        } else {
            System.out.println("Se cheama o echipa de specialisti pentru stabilizarea pacientului");
        }
        handleNext(pacient);
    }

}
