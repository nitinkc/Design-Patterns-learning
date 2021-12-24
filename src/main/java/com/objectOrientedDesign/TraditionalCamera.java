package com.objectOrientedDesign;

public class TraditionalCamera implements ICamera{

    @Override
    public void takePhoto() {
        System.out.println("Take Traditional Photos");
    }

    @Override
    public void savePhoto() {
        System.out.println("Save Traditional Photos");
    }

    @Override
    public boolean flash(boolean isFlashOn) {
        System.out.println("Is Traditional Flash On ? : " + isFlashOn );
        return isFlashOn;
    }
}
