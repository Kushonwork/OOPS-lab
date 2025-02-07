public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Adding two integers: " + calculator.add(2, 3)); 
        System.out.println("Adding two doubles: " + calculator.add(2.5, 3.4)); 
        System.out.println("Adding three integers: " + calculator.add(1, 2, 3)); 
    }
}