package com.objectOrientedDesign;

public class AndroidPhone implements IPhone{

    @Override
    public void makeCall() {
        System.out.println("make Android call");
    }

    @Override
    public void receiveCall() {
        System.out.println("receive Android call");
    }
}
