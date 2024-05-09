package main;
import main.models.Bank;
import main.models.Company;
import main.models.Resident;
import main.models.Restaurant;

public interface Visitor {
    void visitBank(Bank bank);
    void visitCompany(Company company);
    void visitResident(Resident resident);
    void visitRestaurant(Restaurant restaurant);
}
