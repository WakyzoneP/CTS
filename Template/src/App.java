public class App {
    public static void main(String[] args) throws Exception {
        WorldOfWarcraftLoader WoWLoader = new WorldOfWarcraftLoader();
        DiabloLoader diabloLoader = new DiabloLoader();
        WoWLoader.load();
        diabloLoader.load();
    }
}
