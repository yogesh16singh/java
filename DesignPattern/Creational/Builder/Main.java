class Car{
    private String brand;
    private String model;
    private int year;
    private String color;
    
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public String getColor(){
        return color;
    }
    
    private Car(CarBuilder builder){
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
    }
    public static class CarBuilder{
    private String brand;
    private String model;
    private int year;
    private String color;
    
    public CarBuilder setBrand(String brand){
        this.brand = brand;
        return this;
    }
    public CarBuilder setModel(String model){
        this.model = model;
        return this;
    }
    public CarBuilder setYear(int year){
        this.year = year;
        return this;
    }
    public CarBuilder setColor(String color){
        this.color = color;
        return this;
    }
    public Car build(){
        return new Car(this);
    }

}
}

public class Main{
    public static void main(String[] args){
        // Using the builder pattern to create a car
        Car.CarBuilder carBuilder = new Car.CarBuilder();
        Car car = carBuilder.setBrand("Toyota").setModel("Camry").setYear(2023).setColor("Blue").build();

        // Display the car information
        System.out.println("Car created using Builder Pattern:");
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getColor());
    }
}

