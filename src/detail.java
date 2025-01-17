import java.util.Scanner;

public class detail {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Display your name and complete address
        System.out.println("Name: John Doe");
        System.out.println("Address: 123 Main St, Anytown, USA 12345");

        // Take input from users
        System.out.println("Please enter your name:");
        String userName = scanner.nextLine();

        System.out.println("Please enter your address:");
        String userAddress = scanner.nextLine();

        // Display the user's input
        System.out.println("\nYou entered:");
        System.out.println("Name: " + userName);
        System.out.println("Address: " + userAddress);

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}