package main;

public class App {

  public static void main(String[] args) throws Exception {
    Restaurant restaurant = Restaurant.getInstance();
    restaurant.addMasa(new Masa(1, 4, true));
    restaurant.addMasa(new Masa(2, 4, true));
    restaurant.addMasa(new Masa(3, 4, false));
    restaurant.addMasa(new Masa(4, 5, false));
    restaurant.addMasa(new Masa(5, 4, true));
    restaurant.addMasa(new Masa(6, 4, true));
    restaurant.addMasa(new Masa(7, 4, false));
    restaurant.addMasa(new Masa(8, 4, false));
    Ospatar ospatar = new Ospatar("Ospatar1");
    ospatar.preiaComanda(5, 2);
    ospatar.preiaComanda(2, 1);
    ospatar.preiaComanda(2, 2);
    ospatar.afiseazaMese();
    ospatar.inchideComanda(1);
    ospatar.afiseazaMese();
  }
}
