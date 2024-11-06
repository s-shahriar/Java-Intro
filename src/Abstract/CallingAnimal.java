package Abstract;

public class CallingAnimal {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.animalSound();
        Dog dog = new Dog();
        dog.animalSound();
    }
}
