//Clasa observer A(Observator concret)
public class EmailMsgListener implements EventListener {
    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }

    public void update(Event eventType) {
        if(eventType.equals(Event.NEW_ITEM)){
            System.out.println("Email send to " + email + ": new item in shop");
        }
        if(eventType.equals(Event.SALE)) {
            System.out.println("Email send to " + email + ": sales in shop");
        }
    }
}
