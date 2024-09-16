package org.example.e166;

interface Controllable {
    void turnOn();
}

interface Configurable {
    void configure();
}

class SmartHomeDevice implements Controllable, Configurable {
    @Override
    public void turnOn() {
        System.out.println("Turning on Smart Home Device");
    }

    @Override
    public void configure() {
        System.out.println("Configuring Smart Home Device settings");
    }
}

public class E166MultipleInterface {
    public static void main(String[] args) {
        SmartHomeDevice smart = new SmartHomeDevice();
        smart.turnOn();
        smart.configure();
    }
}

