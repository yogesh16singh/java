interface Vehicle{
    void Start();
    void Stop();
}
class Honda implements Vehicle{
    @Override
    public void Start(){
        System.out.println("Honda Start");
    }
    @Override
    public void Stop(){
        System.out.println("Honda Stop");
    }
}
class Toyota implements Vehicle{
    @Override
    public void Start(){
        System.out.println("Toyota Start");
    }
    @Override
    public void Stop(){
        System.out.println("Toyota Stop");
    }
}
 interface VehicleFactory{
    Vehicle createVehicle();
    
}
class HondaFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle(){
        return new Honda();
    }
}
class ToyotaFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle(){
        return new Toyota();
    }
}
public class Main{
    public static void main(String[] args){
        VehicleFactory hondaFactory = new HondaFactory();
        Vehicle honda = hondaFactory.createVehicle();
         honda.Start();
         honda.Stop();

         VehicleFactory toyotaFactory = new ToyotaFactory();
         Vehicle toyota = toyotaFactory.createVehicle();
         toyota.Start();
         toyota.Stop();
         
    }
}
