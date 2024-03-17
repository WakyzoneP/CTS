public class App {
    public static void main(String[] args) throws Exception {
        RegistruBuilder builder = new RegistruBuilder("Registru1", ETipRegistru.REGISTRU_TEXT, 100);
        Registru registru = builder.adaugaDocument(new DocumentWord("Document1", 5, 50)).adaugaDocument(new DocumentExcel("Document2", 10, 20, 50)).adaugaDocument(new DocumentGoogleWorkspace("Document3", "http://google.com", ETipDocument.PREZENTARE, 50)).build();
        registru.continut();
    }
}
