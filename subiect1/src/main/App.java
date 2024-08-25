package main;

import java.util.List;

import chain.Pacient;
import chain.Spital;
import chain.TypeSpital;
import flyweight.Sistem;

public class App {
    public static void main(String[] args) throws Exception {
        Spital s1 = new Spital("spital1", TypeSpital.STAT, 1);
        Spital s2 = new Spital("spital2", TypeSpital.STAT, 1);
        Spital s3 = new Spital("spital3", TypeSpital.PRIVAT, 0);

        s1.preluareCaz(new Pacient("Alex", 5));
        System.out.println("====================================================");
        s1.preluareCaz(new Pacient("Dan", 6));
        System.out.println("====================================================");
        s3.preluareCaz(new Pacient("MihAI", 4));

        Sistem sistem = new Sistem();
        sistem.storeReteta("text1", "diagnostic1", List.of("recomandare1", "recomandare2"));
        sistem.storeReteta("text2", "diagnostic2", List.of("recomandare3", "recomandare4"));
        sistem.storeReteta("text3", "diagnostic1", List.of("recomandare1", "recomandare2"));
        sistem.displey();
    }
}
