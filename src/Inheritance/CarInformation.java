package Inheritance;

import java.util.Scanner;

public class CarInformation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cost of the Car:");
        int cost = scan.nextInt();
        System.out.println("Enter mileage of the Car:");
        int mileage = scan.nextInt();
        System.out.println("Enter color of the Car:");
        scan.nextLine();
        String color = scan.nextLine(); // nextLine() not because it will skip, another way is to add scan.nextLine()
        System.out.println("Enter name of the Car:");
        String carName = scan.nextLine();
        System.out.println("Enter Tyres of the Car:");
        int tyres = scan.nextInt();

        Name car = new Name(cost, mileage, color, tyres, carName);
        car.showInformation();
    }

}
