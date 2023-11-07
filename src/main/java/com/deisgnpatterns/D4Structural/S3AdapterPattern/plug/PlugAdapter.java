package com.deisgnpatterns.D4Structural.S3AdapterPattern.plug;

public class PlugAdapter implements Plug {//Adapter implements the Target interface
    Switch indianSwitch;//Adapter is composed with the Adaptee

    public PlugAdapter(Switch indianSwitch) {
        System.out.println("\nPlugging Adapter");
        this.indianSwitch = indianSwitch;
    }

    @Override
    public void pin3() {
        indianSwitch.pin2();
    }
}
