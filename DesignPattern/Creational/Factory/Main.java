interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }
    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }
} 

class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck is starting");
    }
    @Override
    public void stop() {
        System.out.println("Truck is stopping");
    }
}

class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type.equals("car")) {
            return new Car();
        } else if (type.equals("bike")) {
            return new Bike();
        } else if (type.equals("truck")) {
            return new Truck();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car");
        car.start();
        car.stop();
        Vehicle Bike = VehicleFactory.getVehicle("bike");
        Bike.start();
        Bike.stop();
        Vehicle Truck = VehicleFactory.getVehicle("truck");
        Truck.start();
        Truck.stop();
    }
}




