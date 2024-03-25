package restaurant.build.main;

import restaurant.build.clase.IBuilder;
import restaurant.build.clase.Rezervare;
import restaurant.build.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder rezervareBuilder= new RezervareBuilder();
        Rezervare rezervare1=  ((RezervareBuilder)rezervareBuilder).setAreMuzicaAmbientala(true).setAreScaunErgonomic(true).build();
        Rezervare rezervare2=  ((RezervareBuilder)rezervareBuilder).setAreMuzicaAmbientala(true).setGenMuzica("manele").build();
        Rezervare rezervare3= new RezervareBuilder().setGenMuzica("techno").build();
        System.out.println(rezervare1);
        System.out.println(rezervare2);
        System.out.println(rezervare3);
    }
}
