public class Arma implements Cloneable {
    private String nume;
    private int putere;

    public Arma(String nume) {
        this.nume = nume;
        this.putere = 10;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "nume='" + nume + '\'' +
                ", putere=" + putere +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Arma arma = (Arma) obj;
        return putere == arma.putere && nume.equals(arma.nume);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
