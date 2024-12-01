package Encapsulation;
class Human {
    private int age;
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

public class Encapsulation {
    public static void main(String a[]){
        Human obj = new Human();
        obj.setAge(15);
        obj.setName("Jack");

        int age = obj.getAge();
        String name = obj.getName();

        System.out.println(name+ " "+ age);
    }
}
