package com.deisgnpatterns.D1SOLIDPrinciples.SOLID.D.di1WithoutDependencyInversion;

public class Runner {
    public static void main(String[] args) {
        ElectricPowerSwitch electricPowerSwitch = new ElectricPowerSwitch(new LightBulb());

        for (int i = 0; i < 4; i++) {
            electricPowerSwitch.press();
        }
    }
}
