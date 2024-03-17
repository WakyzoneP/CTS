public class Masa implements IDecoratiuni {

    @Override
    public void curata() {
        System.out.println("Se curata masa.");
    }

    @Override
    public ETipMaterial getMaterial() {
        return ETipMaterial.LEMN;
    }

}
