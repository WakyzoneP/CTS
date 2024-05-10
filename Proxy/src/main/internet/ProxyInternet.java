package main.internet;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private static final List<String> bannedSites;
    private final Internet internet = new Realnternet();

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("banned.com");
    }

    @Override
    public void connectTo(String host) {
        if (bannedSites.contains(host.toLowerCase())) {
            System.out.println("Access Denied");
            return;
        }
        internet.connectTo(host);
    }
}
