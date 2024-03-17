public class DocumentExcel implements IDocument {

    private String titlu;
    private int dimensiune;
    private int nrColoane;
    private int nrRanduri;

    public DocumentExcel(String titlu, int nrColoane, int nrRanduri, int dimensiune) {
        this.titlu = titlu;
        this.nrColoane = nrColoane;
        this.nrRanduri = nrRanduri;
        this.dimensiune = dimensiune;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public int getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    public int getNrColoane() {
        return nrColoane;
    }

    public void setNrColoane(int nrColoane) {
        this.nrColoane = nrColoane;
    }

    public int getNrRanduri() {
        return nrRanduri;
    }

    public void setNrRanduri(int nrRanduri) {
        this.nrRanduri = nrRanduri;
    }

    @Override
    public ETipDocument getTip() {
        return ETipDocument.FOAIE_CALCUL;
    }

    @Override
    public void printeaza() {
        System.out.println("Printez documentul Excel: " + this.titlu);
    }

}
