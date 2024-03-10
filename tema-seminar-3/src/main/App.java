package main;

public class App {

  public static void main(String[] args) throws Exception {
    Franciza franciza = Franciza.getInstance();
    franciza.addRestaurant(new Restaurant("Restaurant 1"));
    franciza.addRestaurant(new Restaurant("Restaurant 2"));

    for (Restaurant restaurant : franciza.getRestaurante()) {
      restaurant.addMasa(new Masa(6, LocatieMasa.INTERIOR));
      restaurant.addMasa(new Masa(4, LocatieMasa.TERASA));
      restaurant.addMasa(new Masa(4, LocatieMasa.BALCON));

      restaurant.addOspatarCredentials("Ospatar 1", 2);
      restaurant.addOspatarCredentials("Ospatar 2", 1);
    }

    Ospatar ospatar = franciza.getRestaurantByDenumire("Restaurant 1").getOspatarDisponibil();
    ospatar.preiaComanda(4, LocatieMasa.INTERIOR);
    ospatar.preiaComanda(4, LocatieMasa.TERASA);
    ospatar.preiaComanda(4, LocatieMasa.TERASA);
    ospatar.afiseazaMese();
    ospatar.inchideComanda(franciza.getRestaurantByDenumire("Restaurant 1").getMese().get(0).getId());
    ospatar.afiseazaMese();
    ospatar.preiaComanda(4, LocatieMasa.BALCON);
    ospatar.afiseazaMese();
    Ospatar ospatar2 = franciza.getRestaurantByDenumire("Restaurant 1").getOspatarDisponibil();
    ospatar2.preiaComanda(4, LocatieMasa.INTERIOR);
    ospatar2.afiseazaMese();
    System.out.println("=============");
    franciza.getRestaurantByDenumire("Restaurant 1").afiseazaMese();
  }
}