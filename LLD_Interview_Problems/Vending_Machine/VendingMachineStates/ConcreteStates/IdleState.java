package LLD_Interview_Problems.Vending_Machine.VendingMachineStates.ConcreteStates;

import LLD_Interview_Problems.Vending_Machine.VendingMachineStates.VendingMachineContext;
import LLD_Interview_Problems.Vending_Machine.VendingMachineStates.VendingMachineState;

// Implementation of the Idle state
public class IdleState implements VendingMachineState {
    public IdleState() {
        System.out.println("Vending machine is now in Idle State");
    }

    @Override
    public String getStateName() {
        return "IdleState";
    }

    @Override
    public VendingMachineState next(VendingMachineContext context) {
        // Check if inventory has items
        if (!context.getInventory().hasItems()) {
            return new OutOfStockState();
        }
        // If money has been inserted, transition to HasMoneyState
        if (!context.getCoinList().isEmpty()) {
            return new HasMoneyState();
        }
        // Otherwise, remain in idle state
        return this;
    }
}
