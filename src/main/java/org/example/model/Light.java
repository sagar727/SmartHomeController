package org.example.model;

public class Light implements Appliance {

    private boolean isOn;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light on");
        System.out.println("**************\n");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light off");
        System.out.println("**************\n");
    }
}
