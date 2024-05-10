package main.internet;

public class Realnternet implements Internet {

    @Override
    public void connectTo(String host) {
        System.out.println("Connecting to " + host);   
    }
}
