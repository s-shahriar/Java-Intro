public class Student {
    String name = "";
    int age;
    double salary;

    public Student(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void showDetails(){
        System.out.println("Name of the Student : "+ name);
        System.out.println("Age of the Student : "+ age);
        System.out.println("Salary of the Student : "+ salary);
    }
}
