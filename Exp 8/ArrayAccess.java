import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index (0 to 4): ");
        int index = scanner.nextInt();

        try {
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter an index between 0 and 4.");
        } finally {
            System.out.println("Array access attempted.");
        }

        scanner.close();
    }
}