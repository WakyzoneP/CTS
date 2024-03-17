public class App {
    public static void main(String[] args) throws Exception {
        MagazinBuilder builder = new MagazinBuilder(250, 3, "Zara");

        Magazin m1 = builder.setPodea(new PodeaLemn()).addDecoratiune(new Candelabru(ETipMaterial.LEMN)).build();

        m1.descriere();
    }
}
