package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Sistem {
    private final List<Reteta> retete = new ArrayList<>();

    public void storeReteta(String text, String diagnostic, List<String> recomandari) {
        Recomandare recomandare = RecomandareFacory.getRecomandare(diagnostic, recomandari);
        retete.add(new Reteta(text, diagnostic, recomandare));
    }

    public void displey() {
        retete.forEach(Reteta::print);
    }
}
