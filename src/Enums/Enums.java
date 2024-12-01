package Enums;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

enum Laptop {
    // Enum values with or without specified prices
    Macbook(2000),
    XPS(2200),
    Surface,       // Default price will be handled in the constructor
    ThinkPad;      // Default price will be handled in the constructor

    private int price; // Price associated with each laptop model

    // Constructor for enum values with price (Macbook, XPS)
    private Laptop(int price) {
        this.price = price;
    }

    // Default constructor for enum values without specified price (Surface, ThinkPad)
    private Laptop() {
        this.price = 0; // Assign a default price (e.g., 0)
    }

    // Method to get the price of the laptop
    public int getPrice() {
        return price;
    }

    // Optional: Method to set a price dynamically
    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enums {
    public static void main(String[] args) {

        // Demonstrating Laptop enum usage
        // This creates an instance of Macbook which is of Laptop (enum) type
        Laptop lap = Laptop.Macbook;
        System.out.println("The price of a Macbook is: $" + lap.getPrice());

        // Iterating through all Laptop enum values
        System.out.println("All available Laptop models and their prices:");
        for (Laptop laptop : Laptop.values()) {
            System.out.println(laptop + ": $" + laptop.getPrice());
        }

        // Setting a price dynamically for Surface
        Laptop.Surface.setPrice(1500);
        System.out.println("\nAfter setting a price dynamically for Surface:");
        System.out.println("Surface: $" + Laptop.Surface.getPrice());

        // Demonstrating Level enum usage
        Level medium = Level.MEDIUM;

        System.out.println("\nLevel switch-case example:");

        switch (medium) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + medium);
        }
    }
}
