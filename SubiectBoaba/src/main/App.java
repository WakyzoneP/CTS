package main;

import java.util.Date;

import proxy.Vizita;
import proxy.VizitaProxy;

public class App {
    public static void main(String[] args) throws Exception {
        VizitaProxy proxy = new VizitaProxy();

        proxy.inregistrareVizita(new Vizita("Dan", new Date(24, 4, 10), "Alex"));
        proxy.inregistrareVizita(new Vizita("Maria", new Date(24, 4, 10), "Alex"));
        proxy.inregistrareVizita(new Vizita("Maria", new Date(24, 4, 10), "Ion"));
        proxy.inregistrareVizita(new Vizita("Maria", new Date(24, 4, 11), "Alex"));
    }
}
