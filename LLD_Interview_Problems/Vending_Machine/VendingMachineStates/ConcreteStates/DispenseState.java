package LLD_Interview_Problems.Vending_Machine.VendingMachineStates.ConcreteStates;

import LLD_Interview_Problems.Vending_Machine.VendingMachineStates.VendingMachineContext;
import LLD_Interview_Problems.Vending_Machine.VendingMachineStates.VendingMachineState;

public class DispenseState implements VendingMachineState {

    public DispenseState() {
        System.out.println("Vending machine is now in Dispense State");
    }

    @Override
    public String getStateName() {
        return "DispenseState";
    }

    @Override
    public VendingMachineState next(VendingMachineContext context) {
        // Dispense the selected product
        return new IdleState();
    }
}