public class App {
    public static void main(String[] args) throws Exception {
        Store store = new Store();
        store.subscribe(Event.SALE, new EmailMsgListener("vlad_beraru@yahoo.com"));
        store.subscribe(Event.NEW_ITEM, new EmailMsgListener("vlad.beraru@nevexo.ro"));
        store.subscribe(Event.SALE, new MobileAppListener("WakyzoneP"));
        store.newItemPromotion(Event.SALE);
        System.out.println("========================================================");
        store.newItemPromotion(Event.NEW_ITEM);
    }
}
