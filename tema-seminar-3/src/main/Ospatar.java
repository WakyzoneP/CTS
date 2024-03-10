package main;

import java.util.UUID;

public class Ospatar {

  private UUID id;
  private String nume;
  private UUID restaurantId;
  private int nrMese;

  public Ospatar(String nume, UUID restaurantId, int nrMese) {
    this.id = UUID.randomUUID();
    this.nume = nume;
    this.restaurantId = restaurantId;
    this.nrMese = nrMese;
  }

  public void preiaComanda(int nrPersoane, LocatieMasa tipLocatie) {
    if (nrMese == 0) {
      System.out.println("Ospatarul " + nume + " nu are mese disponibile");
      return;
    }
    Franciza franciza = Franciza.getInstance();
    Restaurant restaurant = franciza.getRestaurantById(restaurantId);
    Masa masa = restaurant.getMesaDisponibila(nrPersoane, tipLocatie);
    if (masa != null) {
      masa.setOcupat(true);
      masa.setOspatarId(id);
      System.out.println("Masa cu id-ul " + masa.getId() + " este disponibila");
      nrMese--;
    } else {
      System.out.println("Nu exista masa disponibila");
    }
  }

  public void inchideComanda(UUID idMasa) {
    Franciza franciza = Franciza.getInstance();
    Restaurant restaurant = franciza.getRestaurantById(restaurantId);
    for (Masa masa : restaurant.getMese()) {
      if (masa.getId() == idMasa) {
        masa.setOcupat(false);
        masa.setOspatarId(null);
        nrMese++;
        System.out.println(
            "Masa cu id-ul " + masa.getId() + " a fost eliberata");
        return;
      }
    }
    System.out.println("Masa cu id-ul " + idMasa + " nu exista");
  }

  public void afiseazaMese() {
    Franciza franciza = Franciza.getInstance();
    Restaurant restaurant = franciza.getRestaurantById(restaurantId);
    for (Masa masa : restaurant.getMese()) {
      if (masa.getOspatarId() == id) {
        System.out.println(masa);
      }
    }
  }

  public UUID getId() {
    return id;
  }

  public String getNume() {
    return nume;
  }

  public void setNume(String nume) {
    this.nume = nume;
  }

  public UUID getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(UUID restaurantId) {
    this.restaurantId = restaurantId;
  }

  public int getNrMese() {
    return nrMese;
  }

  public void setNrMese(int nrMese) {
    this.nrMese = nrMese;
  }

  @Override
  public String toString() {
    return "Ospatar [id=" + id + ", nume=" + nume + ", restaurantId=" + restaurantId + ", nrMese=" + nrMese + "]";
  }
}
