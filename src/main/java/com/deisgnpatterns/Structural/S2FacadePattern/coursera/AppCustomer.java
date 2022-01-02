package com.deisgnpatterns.Structural.S2FacadePattern.coursera;

public class AppCustomer {
    public static void main(String[] args) {
        BankServiceFacade bankServiceFacade = new BankServiceFacade();

        bankServiceFacade.createNewAccount("saving", 1000);
    }
}
