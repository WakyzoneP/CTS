package main;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Restaurant {

  private UUID id;
  private String denumire;
  private List<Masa> mese;
  private List<Ospatar> ospatari;

  public Restaurant() {
    this.id = UUID.randomUUID();
    this.denumire = "N/A";
    mese = new ArrayList<>();
    ospatari = new ArrayList<>();
  }

  public Restaurant(String denumire) {
    this.id = UUID.randomUUID();
    this.denumire = denumire;
    mese = new ArrayList<>();
    ospatari = new ArrayList<>();
  }

  public void addOspatar(Ospatar ospatar) {
    ospatari.add(ospatar);
  }

  public void addOspatarCredentials(String nume, int nrMese) {
    Ospatar ospatar = new Ospatar(nume, id, nrMese);
    ospatari.add(ospatar);
  }

  public List<Ospatar> getOspatari() {
    return ospatari;
  }

  public void addMasa(Masa masa) {
    mese.add(masa);
  }

  public List<Masa> getMese() {
    return mese;
  }

  public UUID getId() {
    return id;
  }

  public String getDenumire() {
    return denumire;
  }

  public void setDenumire(String denumire) {
    this.denumire = denumire;
  }

  public Masa getMesaDisponibila(int nrPersoane, LocatieMasa locatie) {
    for (Masa masa : mese) {
      if (masa.getNrScaune() >= nrPersoane && !masa.isOcupat()) {
        if (locatie == LocatieMasa.ORIUNDE) {
          return masa;
        } else if (masa.getLocatie() == locatie) {
          return masa;
        }
      }
    }
    return null;
  }

  public Ospatar getOspatarDisponibil() {
    for (Ospatar ospatar : ospatari) {
      if (ospatar.getNrMese() > 0) {
        return ospatar;
      }
    }
    return null;
  }

  public void afiseazaMese() {
    for (Masa masa : mese) {
      System.out.println(masa);
    }
  }

  @Override
  public String toString() {
    return "Restaurant [id=" + id + ", denumire=" + denumire + ", mese=" + mese + ", ospatari=" + ospatari + "]";
  }
}
