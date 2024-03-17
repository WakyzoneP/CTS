public class DocumentGoogleWorkspace implements IDocument {

    private String titlu;
    private int dimensiune;
    private String url;
    private ETipDocument tip;

    public DocumentGoogleWorkspace(String titlu, String url, ETipDocument tip, int dimensiune) {
        this.titlu = titlu;
        this.url = url;
        this.tip = tip;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ETipDocument getTip() {
        return tip;
    }

    public void setTip(ETipDocument tip) {
        this.tip = tip;
    }

    @Override
    public void printeaza() {
        System.out.println("Printez documentul Google Workspace: " + this.titlu);
    }

}
