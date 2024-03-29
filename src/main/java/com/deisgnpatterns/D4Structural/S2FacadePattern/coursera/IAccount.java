package com.deisgnpatterns.D4Structural.S2FacadePattern.coursera;

public interface IAccount {
    public void deposit(Integer amount);
    public void withdraw(Integer amount);
    public void transfer(Integer amount);
    public void balance();
    public Integer getAccountNumber();
}
