import java.util.List;
import java.util.ArrayList;

public class RegistruBuilder implements IBuilder {
    private String nume;
    private ETipRegistru tip;
    private int dimensiuneMaxima;
    private List<IDocument> documente = null;

    public RegistruBuilder(String nume, ETipRegistru tip, int dimensiuneMaxima) {
        this.nume = nume;
        this.tip = tip;
        this.dimensiuneMaxima = dimensiuneMaxima;
        documente = new ArrayList<>();
    }

    public RegistruBuilder adaugaDocument(IDocument document) {
        documente.add(document);
        return this;
    }

    @Override
    public Registru build() {
        Registru registru = new Registru(nume, tip, dimensiuneMaxima);
        documente.forEach(doc -> {
            try {
                registru.adaugareDocument(doc);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return registru;
    }
}
