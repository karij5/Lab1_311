public class Vehicle {
    //data for the vehicle is below
        private int numberOfWheels;
        private String color;
        private float engineSize;
        private String fuelType;

        //parameterized constructor for the Vehicle class, contains parameters for a number of wheels, color,
        //engine size and fuel type. I didn't make a default since I don't think I need one.
    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    //getter for number of wheels
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    //setter for number of wheels
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    //getter for color
    public String getColor() {
        return color;
    }
    //setter for color
    public void setColor(String color) {
        this.color = color;
    }

    //getter for engine size
    public float getEngineSize() {
        return engineSize;
    }

    //setter for engine size
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    //setter for fuel type
    public String getFuelType() {
        return fuelType;
    }

    //setter for fuel type
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
