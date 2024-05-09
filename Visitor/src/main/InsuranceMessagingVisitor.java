package main;
import java.util.List;

import main.models.Bank;
import main.models.Client;
import main.models.Company;
import main.models.Resident;
import main.models.Restaurant;

public class InsuranceMessagingVisitor implements Visitor {

    public void sendInsuranceMails(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }

    @Override
    public void visitBank(Bank bank) {
        System.out.println("Sending email about theft insurance... " + bank.getName());
    }

    @Override
    public void visitCompany(Company company) {
        System.out.println("Sending emplyees and equipment insurance mail... " + company.getName());
    }

    @Override
    public void visitResident(Resident resident) {
        System.out.println("Sending mail about medical insurance... " + resident.getName());
    }

    @Override
    public void visitRestaurant(Restaurant restaurant) {
        System.out.println("Sending mail about fire and food insurance... " + restaurant.getName());
    }

}
