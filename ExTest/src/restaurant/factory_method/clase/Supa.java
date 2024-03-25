package restaurant.factory_method.clase;

public abstract class Supa {
    private String denumire;
    private int cantitate;

    public Supa(String denumire, int cantitate) {
        this.denumire = denumire;
        this.cantitate = cantitate;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getCantitate() {
        return cantitate;
    }
    public abstract void descriereSupa();
}
