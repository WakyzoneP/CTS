package main;

public class App {
    public static void main(String[] args) throws Exception {
        BuyCryptoFacade buyCrypto = new BuyCryptoFacade();
        buyCrypto.buyCryptocurrency(100, "Bitcoin");
    }
}
