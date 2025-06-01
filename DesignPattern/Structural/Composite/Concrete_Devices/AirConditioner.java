package DesignPattern.Structural.Composite.Concrete_Devices;

import DesignPattern.Structural.Composite.SmartComponent;

public class AirConditioner implements SmartComponent {
    @Override
    public void turnOn() {
        System.out.println("Air Conditioner is now ON.");
    }
    @Override
    public void turnOff() {
        System.out.println("Air Conditioner is now OFF.");
    }
}