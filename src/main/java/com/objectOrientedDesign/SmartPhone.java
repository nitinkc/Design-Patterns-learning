package com.objectOrientedDesign;

public class SmartPhone {
    private ICamera iCamera;
    private IPhone iPhone;

    public SmartPhone(){
        this.iCamera = new TraditionalCamera();
        this.iPhone = new TraditionalPhone();
    }
    public SmartPhone(ICamera iCamera, IPhone iPhone){
        this.iCamera = iCamera;
        this.iPhone = iPhone;
    }
    public void useCamera(){
        this.iCamera.takePhoto();
    }

    public void usePhone(){
        this.iPhone.makeCall();
    }
}
