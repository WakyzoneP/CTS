package main;

public class FancyUIServiceAdapter implements IMultiRestoApp {
    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter() {
        this.fancyUIService = new FancyUIService();
    }

    @Override
    public void displayMenu(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayMenu(jsonData);
    }

    @Override
    public void displayRecommendation(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayRecommendation(jsonData);
    }

    private JsonData convertXmlToJson(XmlData xmlData) {
        return new JsonData();
    }
}
