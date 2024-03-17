import java.util.List;

public abstract class ARegistru {
    protected ETipRegistru tip;
    protected String nume;
    protected int dimensiuneMaxima;
    protected List<IDocument> documente = null;

    ARegistru(String nume, ETipRegistru tip, int dimensiuneMaxima) {
        this.nume = nume;
        this.tip = tip;
        this.dimensiuneMaxima = dimensiuneMaxima;
    }

    public abstract void continut();

    public abstract int calculDimensiune();

    public abstract void adaugareDocument(IDocument document) throws Exception;
}
