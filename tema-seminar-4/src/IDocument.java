public interface IDocument {
    ETipDocument getTip();
    int getDimensiune();
    void setDimensiune(int dimensiune);
    String getTitlu();
    void setTitlu(String titlu);
    void printeaza();
}
