public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <number1> <operator> <number2>");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        String operator = args[1];

        switch (operator) {
            case "+":
                int sum = num1 + num2;
                System.out.printf("Sum of %d and %d is %d%n", num1, num2, sum);
                break;
            case "-":
                int difference = num1 - num2;
                System.out.printf("Difference of %d and %d is %d%n", num1, num2, difference);
                break;
            case "*":
                int product = num1 * num2;
                System.out.printf("Product of %d and %d is %d%n", num1, num2, product);
                break;
            default:
                System.out.println("Invalid operator. Use +, -, or *");
        }
    }
}