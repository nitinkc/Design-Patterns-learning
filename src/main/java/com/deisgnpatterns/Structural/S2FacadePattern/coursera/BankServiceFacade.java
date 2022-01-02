package com.deisgnpatterns.Structural.S2FacadePattern.coursera;

import lombok.Getter;
import lombok.Setter;

import java.util.Hashtable;

@Getter
@Setter
public class BankServiceFacade {
    private Hashtable<Integer, IAccount> bankAccounts;

    public Integer createNewAccount(String type, Integer initialAmount){
        IAccount account = null;

        switch (type){
            case "chequing":
                account = new Chequing(initialAmount);
                break;
            case "saving":
                account = new Chequing(initialAmount);
                break;
            case "investment":
                account = new Chequing(initialAmount);
                break;
        }

        if(null != account){
            this.bankAccounts.put(account.getAccountNumber(), account);
            return account.getAccountNumber();
        }

        return -1;
    }
}
