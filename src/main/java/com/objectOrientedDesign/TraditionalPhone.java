package com.objectOrientedDesign;

public class TraditionalPhone implements IPhone{
    @Override
    public void makeCall() {
        System.out.println("make call");
    }

    @Override
    public void receiveCall() {
        System.out.println("receive call");
    }
}
