import java.util.HashMap;
import java.util.Map;

public class PersonajPrototypeFactory {
    private static Map<ETipPersonaj, APersonaj> mapPersonaje;

    static {
        mapPersonaje = new HashMap<>();
        mapPersonaje.put(ETipPersonaj.Erou, new Erou("Arthur"));
        mapPersonaje.put(ETipPersonaj.Monstru, new Monstru());
    }

    public static APersonaj getPrototipPersonaj(ETipPersonaj tipPersonaj) {
        try {
            if (!mapPersonaje.containsKey(tipPersonaj))
                throw new IllegalArgumentException("Tipul de personaj nu exista");
            return (APersonaj) mapPersonaje.get(tipPersonaj).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
