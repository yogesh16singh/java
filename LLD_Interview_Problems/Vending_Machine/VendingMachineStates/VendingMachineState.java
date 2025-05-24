package LLD_Interview_Problems.Vending_Machine.VendingMachineStates;

public interface VendingMachineState {

    String getStateName();

    VendingMachineState next(VendingMachineContext context);
    
} 
