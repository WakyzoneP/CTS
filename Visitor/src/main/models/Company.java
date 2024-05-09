package main.models;

import main.Visitor;

public class Company extends Client {
    private final int nrOfEmployees;

    public Company(String name, String address, String number, int nrOfEmployees) {
        super(name, address, number);
        this.nrOfEmployees = nrOfEmployees;
    }

    public int getNrOfEmployees() {
        return nrOfEmployees;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompany(this);
    }

}
