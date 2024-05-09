package main;
public class App {
    public static void main(String[] args) throws Exception {
        IMultiRestoApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.displayMenu(new XmlData());

        FancyUIServiceAdapter adapter = new FancyUIServiceAdapter();
        adapter.displayMenu(new XmlData());
    }
}
