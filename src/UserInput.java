import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = input.nextLine();
        System.out.println("Enter Age");
        int age = input.nextInt();
        System.out.println("Enter Salary");
        double salary = input.nextDouble();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        Student std = new Student(name,age,salary);
        std.showDetails();
    }
}
