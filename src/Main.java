public class Main {
    public static void main(String[] args) {

        Vehicle firstBike = new Vehicle (2, "blue", 599, "petrol");
        Car firstCar = new Car(4, "red", 54, "petrol", "Honda");

        System.out.println(firstBike.getNumberOfWheels());
        System.out.println(firstBike.getColor());
        System.out.println(firstBike.getEngineSize());
        System.out.println(firstBike.getFuelType());


        System.out.println(firstCar.getNumberOfWheels());
        System.out.println(firstCar.getColor());
        System.out.println(firstCar.getEngineSize());
        System.out.println(firstCar.getFuelType());
        System.out.println(firstCar.getBrand());

        firstCar.honk();

        firstCar.displayInfo();



    }
}