public class DivisionDemo {
    public static void divideNumbers(int numerator, int denominator) {
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division cannot be performed.");
            System.out.println("Reason: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
    