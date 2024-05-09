package main;

public class MultiRestoApp implements IMultiRestoApp {

    @Override
    public void displayMenu(XmlData xmlData) {
        System.out.println("Displaying Menus using XML data...");
    }

    @Override
    public void displayRecommendation(XmlData xmlData) {
        System.out.println("Displaying Recommendations using XML data...");
    }

}
