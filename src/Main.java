public class Main {
    public static void main(String[] args) {

        Vehicle firstBike = new Vehicle (2, "blue", 599, "petrol");
        Car firstCar = new Car(4, "red", 54, "petrol", "Honda");

        //testing to ensure that the vehicle class setters and getters get the right data
        System.out.println(firstBike.getNumberOfWheels());
        System.out.println(firstBike.getColor());
        System.out.println(firstBike.getEngineSize());
        System.out.println(firstBike.getFuelType());


        //testing to ensure that the car class setters and getters get the right data
        System.out.println(firstCar.getNumberOfWheels());
        System.out.println(firstCar.getColor());
        System.out.println(firstCar.getEngineSize());
        System.out.println(firstCar.getFuelType());
        System.out.println(firstCar.getBrand());

        //testing honk method
        firstCar.honk();

        //testing the display method
        firstCar.displayInfo();



    }
}