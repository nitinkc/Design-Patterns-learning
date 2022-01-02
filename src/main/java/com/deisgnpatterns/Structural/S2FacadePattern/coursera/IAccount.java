package com.deisgnpatterns.Structural.S2FacadePattern.coursera;

public interface IAccount {
    public void deposit(Integer amount);
    public void withdraw(Integer amount);
    public void transfer(Integer amount);
    public Integer getAccountNumber();
}
