//Clasa obeservabil concret
public class Store extends NotificationService {

    //Metoda care declanseaza modificarea unei stari a obiectului 
    //observabil ce duce la apelul metodei notify all
    public void newItemPromotion(Event eventType) {
        this.notifyCustomers(eventType);
    }
}
