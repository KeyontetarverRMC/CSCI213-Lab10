// Define a new class called "Car" that extends the "Vehicle" class
public class Car extends Vehicle {
    
    // Define two private instance variables, "doors" and "passengers"
    private int doors;
    private int passengers;
    
    // Define a constructor that takes five parameters
    public Car(String make, String model, String plate, int doorNum, int passNum) {
        // Call the constructor of the parent class ("Vehicle") with the "make", "model", and "plate" parameters
        super(make, model, plate);
        // Set the "doors" and "passengers" variables using the remaining two parameters
        this.doors = doorNum;
        this.passengers = passNum;
    }
    
    // Define a method to get the number of doors
    public int getDoors() {
        return this.doors;
    }

    // Define a method to get the number of passengers
    public int getPassengers() {
        return this.passengers;
    }
    
    // Override the "toString" method to return a string representation of the car
    @Override
    public String toString() {
        String carInfo = "";
        // Format the string to include the number of doors, make, model, and license plate
        carInfo = String.format("%d-door %s %s with license %s", this.doors, this.make, this.model, this.plate);
        return carInfo;
    }

    // Override the "equals" method to compare cars based on their number of doors, passengers, and parent vehicle properties
    @Override
    public boolean equals(Object other) {
        // Check if the "other" object is a car
        if(!(other instanceof Car)) {
            return false;
        }
        
        // Cast the "other" object to a car
        Car otherCar = (Car) other;
        
        // Compare the number of doors, passengers, and parent vehicle properties
        if(this.doors == otherCar.getDoors() &&
           this.passengers == otherCar.getPassengers() &&
           super.equals(otherCar)) {
            return true;
        } else {
            return false;
        }
    }
    
    // Define a method to create a copy of the car
    @Override
    public Car copy() {
        // Create a new car with the same make, model, and plate as the original car
        Car carCopy = new Car(this.getMake(), this.getModel(), this.getPlate());
        // Set the number of doors and passengers to the same values as the original car
        carCopy.setDoors(this.getDoors());
        carCopy.setPassengers(this.getPassengers()); 
        return carCopy;
    }
}
