package main;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

  private static volatile Restaurant instance = null;
  private List<Masa> mese;

  private Restaurant() {
    mese = new ArrayList<>();
  }

  public static Restaurant getInstance() {
    Restaurant result = instance;
    if (result == null) {
      synchronized (Restaurant.class) {
        result = instance;
        if (result == null) {
          result = new Restaurant();
        }
      }
    }

    return result;
  }

  public void addMasa(Masa masa) {
    mese.add(masa);
  }

  public List<Masa> getMese() {
    return mese;
  }

  public Masa getMesaDisponibila(int nrPersoane, int tipLocatie) {
    for (Masa masa : mese) {
      if (masa.getNrScaune() >= nrPersoane && !masa.isOcupat()) {
        if (tipLocatie == 2 ||
            (tipLocatie == 1 && masa.isInauntru()) ||
            (tipLocatie == 0 && !masa.isInauntru())) {
          return masa;
        }
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return "Restaurant [mese=" + mese + "]";
  }
}
