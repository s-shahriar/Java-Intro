package Inheritance;

public class Name extends Car {
    String carName;

    // Constructor for Name class
    public Name(int c, int m, String color, int tyres, String carName) {
        super(c, m, color, tyres);
        this.carName = carName;
    }

    // Method to print car's name
    public void carName() {
        System.out.println("Car Name: " + carName);
    }

    public void showInformation() {
        super.showVehicleDetails();
        super.showCarDetails();
        System.out.println("From Name");
        carName();
    }
}
