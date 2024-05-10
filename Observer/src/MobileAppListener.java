//Clasa observer B(Observator concret)
public class MobileAppListener implements EventListener {
    private final String username;

    public MobileAppListener(String username) {
        this.username = username;
    }

    @Override
    public void update(Event eventType) {
        if(eventType.equals(Event.NEW_ITEM)){
            System.out.println("Notification send to " + username + ": new item in shop");
        }
        if(eventType.equals(Event.SALE)) {
            System.out.println("Notification send to " + username + ": sales in shop");
        }
    }
}
