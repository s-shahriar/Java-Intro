package Interface;

public class Man extends Person implements Father {
    int salary;
    public Man(String name, int age, int salary){
        super(name,age);
        this.salary = salary;
    }

    public void task(){
        System.out.println("Salary Printed: "+salary);
    }

}
