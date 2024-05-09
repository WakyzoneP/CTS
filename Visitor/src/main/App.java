package main;

import java.util.List;

import main.models.Client;
import main.models.Bank;
import main.models.Company;
import main.models.Resident;
import main.models.Restaurant;

public class App {
    public static void main(String[] args) throws Exception {
        List<Client> clients = List.of(
            new Bank("Bank of America", "123 Main St", "123-456-7890", 5),
            new Company("Google", "456 Main St", "987-654-3210", 100),
            new Resident("John Doe", "789 Main St", "456-789-0123", "A"),
            new Restaurant("McDonald's", "101 Main St", "321-654-9870", true)
        );

        InsuranceMessagingVisitor visitor = new InsuranceMessagingVisitor();
        visitor.sendInsuranceMails(clients);
    }
}
