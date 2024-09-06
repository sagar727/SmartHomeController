package org.example;

import org.example.controller.ApplianceController;

public class Main {
    public static void main(String[] args) {

        ApplianceController controller = new ApplianceController();
        controller.scheduleUpdate();
        controller.control();
    }
}