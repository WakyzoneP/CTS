public class Candelabru implements IDecoratiuni {

    private ETipMaterial material;

    public Candelabru(ETipMaterial material) {
        this.material = material;
    }

    @Override
    public void curata() {
        System.out.println("Se curata candelabrul.");
    }

    @Override
    public ETipMaterial getMaterial() {
        return material;
    }

}
