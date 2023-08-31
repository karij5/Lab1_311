public class Car extends Vehicle{
    private String brand;

    //constructor for Car, superimposes vehicle constructor, also takes in a brand
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand=brand;
    }

    //getter for brand
    public String getBrand() {
        return brand;
    }

    //setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //Honk method, displays the message specified
    public void honk(){
        System.out.println("Honk, honk!");
    }



    //Displays the information associated with a car object in print statements.

    public void displayInfo(){
        System.out.println("Wheels: " + this.getNumberOfWheels());
        System.out.println("Color: " + this.getColor());
        System.out.println("Engine Size: " + this.getEngineSize());
        System.out.println("Fuel Type: " + this.getFuelType());
        System.out.println("Brand: " + this.getBrand());
    }

}
