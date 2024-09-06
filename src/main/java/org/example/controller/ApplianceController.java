package org.example.controller;

import org.example.model.Fan;
import org.example.model.Light;
import org.example.model.Thermostat;
import org.example.view.ApplianceView;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class ApplianceController {
    private final ApplianceView view = new ApplianceView();
    private final Light light = new Light();
    private final Fan fan = new Fan();
    private final Thermostat thermostat = new Thermostat();
    private boolean running = true;

    public void control() {
        while (running) {
            view.displayMenu();
            int selection = view.getUserSelection();
            switch (selection) {
                case 1:
                    view.displaySubMenu();
                    int option = view.getUserSelection();
                    if (option == 1) {
                        light.turnOn();
                    } else if (option == 2) {
                        light.turnOff();
                    } else if (option == 3) {
                        System.out.println("You selected option: Exit");
                        running = false;
                    } else {
                        System.out.println("You selected invalid option.");
                    }
                    break;
                case 2:
                    view.displaySubMenuFan();
                    int fanOption = view.getUserSelection();
                    if (fanOption == 1) {
                        fan.turnOn();
                    } else if (fanOption == 2) {
                        fan.turnOff();
                    } else if (fanOption == 3) {
                        fan.speedUp();
                    } else if (fanOption == 4) {
                        fan.speedDown();
                    } else if (fanOption == 5) {
                        System.out.println("You selected option: Exit");
                        running = false;
                    } else {
                        System.out.println("You selected invalid option.");
                    }
                    break;
                case 3:
                    view.displaySubMenu();
                    int acOption = view.getUserSelection();
                    if (acOption == 1) {
                        thermostat.turnOn();
                    } else if (acOption == 2) {
                        thermostat.turnOff();
                    } else if (acOption == 3) {
                        System.out.println("You selected option: Exit");
                        running = false;
                    } else {
                        System.out.println("You selected invalid option.");
                    }
                    break;
                case 4:
                    System.out.println("You selected option: Exit");
                    running = false;
                    break;
                default:
                    System.out.println("You selected invalid option.");
            }
        }
    }

    public void turnOffAll(){
        light.turnOff();
        fan.turnOff();
        thermostat.turnOff();
        System.out.println("All appliances are turned off in order to update system.");
        System.out.println("**************\n");
        running = false;
    }

    public void scheduleUpdate(){
        Timer timer = new Timer();
        Calendar updateTime = Calendar.getInstance();

        //for testing purpose, please comment below code

        updateTime.set(Calendar.MONTH,Calendar.JANUARY);
        updateTime.set(Calendar.DAY_OF_MONTH,1);
        updateTime.set(Calendar.HOUR_OF_DAY,1);
        updateTime.set(Calendar.MINUTE,0);
        updateTime.set(Calendar.SECOND,0);

        Calendar now = Calendar.getInstance();
        if(now.after(updateTime)){
            updateTime.add(Calendar.YEAR,1);
        }

        //up to above line

        //for testing purpose, please uncomment below two lines. and when you run app, it will be triggered after 1 minute.

//        long millis = System.currentTimeMillis();
//        updateTime.setTimeInMillis(millis + 60000);

        long duration = 365 * 24 * 60 * 60 * 1000L;
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                turnOffAll();
            }
        },updateTime.getTime(), duration);
    }
}