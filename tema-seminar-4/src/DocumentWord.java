public class DocumentWord implements IDocument {

    private String titlu;
    private int dimensiune;
    private int nrPagini;

    public DocumentWord(String titlu, int nrPagini, int dimensiune) {
        this.titlu = titlu;
        this.nrPagini = nrPagini;
        this.dimensiune = dimensiune;
    }

    @Override
    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    @Override
    public String getTitlu() {
        return this.titlu;
    }

    @Override
    public int getDimensiune() {
        return this.dimensiune;
    }

    @Override
    public void setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    @Override
    public ETipDocument getTip() {
        return ETipDocument.DOCUMENT_TEXT;
    }

    @Override
    public void printeaza() {
        System.out.println("Printez documentul Word: " + this.titlu);
    }

}
