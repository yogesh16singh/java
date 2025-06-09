package DesignPattern.Structural.Adapter.Concrete_Adapters;

import DesignPattern.Structural.Adapter.SmartDevice;
import DesignPattern.Structural.Adapter.Concrete_Devices.AirConditioner;

public class AirConditionerAdapter implements SmartDevice {
    private AirConditioner airConditioner;
    // Constructor
    public AirConditionerAdapter(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void turnOn() {
        airConditioner.connectViaBluetooth();
        airConditioner.startCooling();
    }

    @Override
    public void turnOff() {
        airConditioner.stopCooling();
        airConditioner.disconnectBluetooth();
    }
}
