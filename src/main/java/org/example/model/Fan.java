package org.example.model;

public class Fan implements Appliance {

    private int speed;

    @Override
    public void turnOn() {
       speed = 1;
       System.out.println("Fan is on.");
       System.out.println("**************\n");
    }

    @Override
    public void turnOff() {
        speed = 0;
        System.out.println("Fan is off.");
        System.out.println("**************\n");
    }

    public void speedUp(){
        if(speed < 2){
            speed += 1;
            System.out.println("Fan is on speed "+ speed + " .");
            System.out.println("**************\n");
        }else{
            System.out.println("Fan is already on maximum speed.");
            System.out.println("**************\n");
        }
    }

    public void speedDown(){
        if(speed > 0){
            speed -= 1;
            System.out.println("Fan is on speed "+ speed + " .");
            System.out.println("**************\n");
        }else{
            System.out.println("Fan is already on minimum speed.");
            System.out.println("**************\n");
        }
    }
}
