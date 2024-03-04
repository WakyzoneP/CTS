package main;

public class Ospatar {

  private String nume;

  public Ospatar(String nume) {
    this.nume = nume;
  }

  public String getNume() {
    return nume;
  }

  public void setNume(String nume) {
    this.nume = nume;
  }

  /*
   * tiplocatie:
   * 1 - inauntru
   * 0 - afara
   * 2 - oriunde
   */

  public void preiaComanda(int nrPersoane, int tipLocatie) {
    Restaurant restaurant = Restaurant.getInstance();
    Masa masa = restaurant.getMesaDisponibila(nrPersoane, tipLocatie);
    if (masa != null) {
      masa.setOcupat(true);
      System.out.println("Masa cu id-ul " + masa.getId() + " este disponibila");
    } else {
      System.out.println("Nu exista masa disponibila");
    }
  }

  public void inchideComanda(int idMasa) {
    Restaurant restaurant = Restaurant.getInstance();
    for (Masa masa : restaurant.getMese()) {
      if (masa.getId() == idMasa) {
        masa.setOcupat(false);
        System.out.println(
          "Masa cu id-ul " + masa.getId() + " a fost eliberata"
        );
        return;
      }
    }
    System.out.println("Masa cu id-ul " + idMasa + " nu exista");
  }

  public void afiseazaMese() {
    Restaurant restaurant = Restaurant.getInstance();
    for (Masa masa : restaurant.getMese()) {
      System.out.println(masa);
    }
  }
}
