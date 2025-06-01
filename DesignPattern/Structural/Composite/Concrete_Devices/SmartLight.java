package DesignPattern.Structural.Composite.Concrete_Devices;

import DesignPattern.Structural.Composite.SmartComponent;

public class SmartLight implements SmartComponent {
    @Override
    public void turnOn() {
        System.out.println("Smart Light is now ON.");
    }
    @Override
    public void turnOff() {
        System.out.println("Smart Light is now OFF.");
    }
}