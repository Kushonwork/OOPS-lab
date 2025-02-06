public class Pattern {
    public static void main(String[] args) {
        int rows = 5; // Total number of rows

        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) { // For odd rows
                for (int j = 1; j <= i; j++) {
                    System.out.print("? ");
                }
            } else { // For even rows
                for (int j = 1; j <= i * 3; j++) {
                    System.out.print("# ");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}