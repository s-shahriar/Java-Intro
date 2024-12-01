package JavaException;

public class JavaException {

    // Method that throws an exception if division by zero occurs
    // throws is used to handle the errpr in the paremt class (here Main class)
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            // Explicitly throwing an exception when division by zero occurs
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            // Simulating a situation where we explicitly throw an exception
            int result = divide(10, 0);  // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch specific exception (ArithmeticException) and handle it
            System.out.println("Caught Exception: " + e.getClass().getName());
            System.out.println("Exception Message: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other exceptions
            System.out.println("Exception Class: " + e.getClass());
            System.out.println("Exception Occurred: " + e.getClass().getName());
            System.out.println("Exception Message : " + e.getMessage());
        } finally {
            // Ensuring resource cleanup or logging, no matter what
            System.out.println("Finally: Cleanup resources or perform logging.");
        }
    }
}
