package flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecomandareFacory {
    private static Map<String, Recomandare> map = new HashMap();

    public static Recomandare getRecomandare(String diagnostic, List<String> recomandari) {
        if(!map.containsKey(diagnostic)) {
            map.put(diagnostic, new Recomandare(recomandari));
        }

        return map.get(diagnostic);
    }
}
