package Inheritance;

import java.awt.*;

public class Vehicle {
    int cost;
    int mileage;

    public Vehicle(int c, int m){
        cost = c;
        mileage = m;
    }

    public void showVehicleDetails(){
        System.out.println("From vehicle");
        System.out.println("Cost of the Car: "+cost);
        System.out.println("Mileage of the Car: "+mileage);
    }
}
