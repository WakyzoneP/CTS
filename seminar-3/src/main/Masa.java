package main;

public class Masa {
    private int id;
    private int nrScaune;
    private boolean ocupat;
    private boolean inauntru;

    public Masa(int id, int nrScaune, boolean inauntru) {
        this.id = id;
        this.nrScaune = nrScaune;
        this.ocupat = false;
        this.inauntru = inauntru;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isInauntru() {
        return inauntru;
    }

    public void setInauntru(boolean inauntru) {
        this.inauntru = inauntru;
    }

    @Override
    public String toString() {
        return "Masa [id=" + id + ", nrScaune=" + nrScaune + ", ocupat=" + ocupat + ", inauntru=" + inauntru + "]";
    }

    
}
