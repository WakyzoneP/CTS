package flyweight;

public class Reteta {
    private String text;
    private String diagnostic;
    private Recomandare recomandare;

    public Reteta(String text, String diagnostic, Recomandare recomandare) {
        this.text = text;
        this.diagnostic = diagnostic;
        this.recomandare = recomandare;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Recomandare getRecomandare() {
        return recomandare;
    }

    public void setRecomandare(Recomandare recomandare) {
        this.recomandare = recomandare;
    }

    public void print() {
        System.out.println("Reteta [text=" + text + ", diagnostic=" + diagnostic + "]\n Recomandari \n");
        recomandare.print();
    }

}
