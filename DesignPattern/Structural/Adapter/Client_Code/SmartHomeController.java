package DesignPattern.Structural.Adapter.Client_Code;

import DesignPattern.Structural.Adapter.SmartDevice;
import DesignPattern.Structural.Adapter.Concrete_Adapters.AirConditionerAdapter;
import DesignPattern.Structural.Adapter.Concrete_Devices.AirConditioner;

public class SmartHomeController {
    public static void main(String[] args) {
        // Create adapters for each device
        SmartDevice airConditioner = new AirConditionerAdapter(new AirConditioner());
       
        // Control devices through the unified interface
        airConditioner.turnOn();
       
        airConditioner.turnOff();
        
    }
}
