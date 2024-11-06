package Inheritance;

public class Car extends Vehicle {
    String color;
    int tyres;

    public Car(int c, int m, String color, int tyres){
        super(c,m);
        this.color = color;
        this.tyres = tyres;
    }

    public void showCarDetails() {
        System.out.println("From Car");
        System.out.println("Color of the Car: "+color);
        System.out.println("Tyres of the Car: "+tyres);
    }
}
