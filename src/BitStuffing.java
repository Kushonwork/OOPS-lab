import java.util.Scanner;

public class BitStuffing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== Bit Stuffing and Destuffing Program ===");
            System.out.println("1. Perform Bit Stuffing");
            System.out.println("2. Perform Bit Destuffing");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    performBitStuffing(scanner);
                    break;
                case 2:
                    performBitDestuffing(scanner);
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        }
    }
    
    private static void performBitStuffing(Scanner scanner) {
        System.out.print("Enter the bit sequence (only 0s and 1s): ");
        String input = scanner.nextLine();
        
        // Validate input
        if (!input.matches("[01]+")) {
            System.out.println("Invalid input! Please enter only 0s and 1s.");
            return;
        }
        
        StringBuilder stuffed = new StringBuilder();
        int consecutiveOnes = 0;
        
        // Process each bit in the input
        for (char bit : input.toCharArray()) {
            stuffed.append(bit);
            
            if (bit == '1') {
                consecutiveOnes++;
                // After five consecutive 1s, stuff a 0
                if (consecutiveOnes == 5) {
                    stuffed.append('0');
                    consecutiveOnes = 0;
                }
            } else {
                consecutiveOnes = 0;
            }
        }
        
        System.out.println("Original sequence: " + input);
        System.out.println("Stuffed sequence:  " + stuffed.toString());
        System.out.println("Number of stuffed bits: " + 
            (stuffed.length() - input.length()));
    }
    
    private static void performBitDestuffing(Scanner scanner) {
        System.out.print("Enter the stuffed bit sequence (only 0s and 1s): ");
        String input = scanner.nextLine();
        
        // Validate input
        if (!input.matches("[01]+")) {
            System.out.println("Invalid input! Please enter only 0s and 1s.");
            return;
        }
        
        StringBuilder destuffed = new StringBuilder();
        int consecutiveOnes = 0;
        
        // Process each bit in the input
        for (int i = 0; i < input.length(); i++) {
            char currentBit = input.charAt(i);
            destuffed.append(currentBit);
            
            if (currentBit == '1') {
                consecutiveOnes++;
                // If we find five consecutive 1s, skip the next bit (stuffed bit)
                if (consecutiveOnes == 5 && i + 1 < input.length()) {
                    i++; // Skip next bit
                    consecutiveOnes = 0;
                }
            } else {
                consecutiveOnes = 0;
            }
        }
        
        System.out.println("Stuffed sequence:   " + input);
        System.out.println("Destuffed sequence: " + destuffed.toString());
        System.out.println("Number of removed bits: " + 
            (input.length() - destuffed.length()));
    }
    
    // Helper method to validate bit sequence
    private static boolean isValidBitSequence(String bits) {
        for (char bit : bits.toCharArray()) {
            if (bit != '0' && bit != '1') {
                return false;
            }
        }
        return true;
    }
}