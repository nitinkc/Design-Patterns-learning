package com.objectOrientedDesign;

public class AndroidCamera implements ICamera{
    @Override
    public void takePhoto() {
        System.out.println("Take Android Photos");
    }

    @Override
    public void savePhoto() {
        System.out.println("Save Android Photos");
    }

    @Override
    public boolean flash(boolean isFlashOn) {
        System.out.println("Is Android Flash On ? : " + isFlashOn );
        return isFlashOn;
    }
}
