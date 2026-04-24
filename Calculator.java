public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public int square(int a) {
        return a * a;
    }

    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

   
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add: " + calc.add(5, 3));
        System.out.println("Subtract: " + calc.subtract(5, 3));
        System.out.println("Multiply: " + calc.multiply(5, 3));
        System.out.println("Divide: " + calc.divide(5, 3));
        System.out.println("Square: " + calc.square(5));
        System.out.println("Max: " + calc.max(5, 3));
    }
}
