package org.example.model;

public class Thermostat implements Appliance {

    private String mode = "Off";

    @Override
    public void turnOn() {
        mode = "Cool";
        System.out.println("Air Conditioner is on now.");
        System.out.println("**************\n");
    }

    @Override
    public void turnOff() {
        mode = "Off";
        System.out.println("Air Conditioner is off.");
        System.out.println("**************\n");
    }

    public String getMode() {
        return mode;
    }
}
