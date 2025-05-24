// Context Class
class TrafficLightContext {
    private TrafficLightState currentState;
    public TrafficLightContext() {
        currentState = new RedState(); // Start with RED
    }
    public void setState(TrafficLightState state) {
        this.currentState = state;
    }
    public void next() {
        currentState.next(this);
    }
    public String getColor() {
        return currentState.getColor();
    }
}

// State Interface
interface TrafficLightState {
    void next(TrafficLightContext context);
    String getColor();
}
// Concrete State: Red
class RedState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from RED to GREEN. Cars go!");
        context.setState(new GreenState());
    }
    @Override
    public String getColor() {
        return "RED";
    }
}

// Concrete State: Green
class GreenState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from GREEN to YELLOW. Slow down!");
        context.setState(new YellowState());
    }
    @Override
    public String getColor() {
        return "GREEN";
    }
}

// Concrete State: Yellow
class YellowState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from YELLOW to RED. Stop!");
        context.setState(new RedState());
    }
    @Override
    public String getColor() {
        return "YELLOW";
    }
}

// Driver Class
public class Main {
    public static void main(String[] args) {
        TrafficLightContext trafficLight = new TrafficLightContext();
        trafficLight.next(); // RED -> GREEN
        trafficLight.next(); // GREEN -> YELLOW
        trafficLight.next(); // YELLOW -> RED
        trafficLight.next(); // RED -> GREEN
        // Adding new states like BLINKING or MAINTENANCE is easy now
    }
}