package chain;

import java.util.List;

public class CheckSpitaleHandler extends Handler {

    @Override
    public void handle(Pacient pacient) {
        List<Spital> listaSpitale = Spital.listaSpitale;
        boolean gasit = false;

        for (Spital s : listaSpitale) {
            if (s.getNrLocuri() != 0 && s.getTip() == TypeSpital.STAT) {
                gasit = true;
                System.out.println(
                        "Spitalul " + s.getNume().toUpperCase() + " are " + s.getNrLocuri() + " locuri libere");
                break;
            }
        }

        if (gasit == false) {
            System.out.println("Nu s-au gasit spitale cu locuri libere");
        }
    }

}
