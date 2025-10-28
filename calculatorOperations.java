public class calculatorOperations {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Not a Number
        }
        return num1 / num2;
    }
}
