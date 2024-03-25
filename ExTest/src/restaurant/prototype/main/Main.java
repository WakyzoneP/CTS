package restaurant.prototype.main;

import restaurant.prototype.clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Clau");
        Client clientCopie = (Client) client.cloneaza();
        System.out.println(client);
        System.out.println(clientCopie);
    }
}
