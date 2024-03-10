package main;

import java.util.UUID;

public class Masa {
    private UUID id;
    private UUID ospatarId;
    private int nrScaune;
    private boolean ocupat;
    private LocatieMasa locatie;

    public Masa(int nrScaune, LocatieMasa locatie) {
        this.id = UUID.randomUUID();
        this.ospatarId = null;
        this.nrScaune = nrScaune;
        this.ocupat = false;
        if (locatie == LocatieMasa.ORIUNDE) {
            this.locatie = LocatieMasa.INTERIOR;
        } else {
            this.locatie = locatie;
        }
    }

    public UUID getId() {
        return id;
    }

    public int getNrScaune() {
        return nrScaune;
    }

    public void setNrScaune(int nrScaune) {
        this.nrScaune = nrScaune;
    }

    public boolean isOcupat() {
        return ocupat;
    }

    public void setOcupat(boolean ocupat) {
        this.ocupat = ocupat;
    }

    public LocatieMasa getLocatie() {
        return locatie;
    }

    public void setLocatie(LocatieMasa locatie) {
        this.locatie = locatie;
    }

    public UUID getOspatarId() {
        return ospatarId;
    }

    public void setOspatarId(UUID ospatarId) {
        this.ospatarId = ospatarId;
    }

    @Override
    public String toString() {
        return "Masa [id=" + id + ", nrScaune=" + nrScaune + ", ocupat=" + ocupat + ", locatie=" + locatie
                + ", ospatarId="
                + ospatarId + "]";
    }

}
