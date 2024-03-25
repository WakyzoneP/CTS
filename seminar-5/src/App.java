public class App {
    public static void main(String[] args) throws Exception {
        APersonaj erou1 = PersonajPrototypeFactory.getPrototipPersonaj(ETipPersonaj.Erou);
        APersonaj erou2 = PersonajPrototypeFactory.getPrototipPersonaj(ETipPersonaj.Erou);
        APersonaj monstru1 = PersonajPrototypeFactory.getPrototipPersonaj(ETipPersonaj.Monstru);

        if (erou1.listaArme.get(0).equals(erou2.listaArme.get(0)))
            System.out.println("Cele doua arme sunt identice");
        else
            System.out.println("Cele doua arme sunt diferite");

        System.out.println("Erou1: " + erou1);
        System.out.println("Erou2: " + erou2);
        erou1.ataca(erou2);
        System.out.println("Erou1: " + erou1);
        System.out.println("Erou2: " + erou2);

        System.out.println("====================");

        monstru1.ataca(erou1);
        System.out.println("Monstru1: " + monstru1);
        System.out.println("Erou1: " + erou1);

        
    }
}
