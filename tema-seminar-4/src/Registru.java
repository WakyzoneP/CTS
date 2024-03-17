import java.util.ArrayList;

public class Registru extends ARegistru {

    Registru(String nume, ETipRegistru tip, int dimensiuneMaxima) {
        super(nume, tip, dimensiuneMaxima);
        documente = new ArrayList<>();
    }

    @Override
    public void continut() {
        System.out.println("Continut registru " + nume + ":");
        documente.forEach(doc -> doc.printeaza());
    }

    @Override
    public int calculDimensiune() {
        return documente.stream().mapToInt(doc -> doc.getDimensiune()).sum();
    }

    @Override
    public void adaugareDocument(IDocument document) throws Exception {
        if (calculDimensiune() + document.getDimensiune() > dimensiuneMaxima) {
            throw new Exception("Registru plin");
        }
        if (tip == ETipRegistru.REGISTRU_TEXT && document.getTip() != ETipDocument.DOCUMENT_TEXT)
            throw new Exception("Documentul nu este de tip text");
        if (tip == ETipRegistru.REGISTRU_FOAIE_CALCUL && document.getTip() != ETipDocument.FOAIE_CALCUL)
            throw new Exception("Documentul nu este de tip imagine");
        if (tip == ETipRegistru.REGISTRU_PREZENTARE && document.getTip() != ETipDocument.PREZENTARE)
            throw new Exception("Documentul nu este de tip imagine");
        documente.add(document);
    }

}
