import java.util.Scanner;

class GradeCard {
    private String studentName;
    private int rollNumber;
    private String className;
    private double[] grades = new double[5];
    private double average;
    private char grade;

    public void inputStudentInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        studentName = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNumber = scanner.nextInt();

        System.out.print("Enter Class Name: ");
        scanner.nextLine(); 
        className = scanner.nextLine();

        System.out.println("Enter grades for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }
    }

    public void calculateAverageAndGrade() {
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        average = total / grades.length;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public void displayGradeCard() {
        System.out.println("\n--------- Grade Card ---------");
        System.out.println("Name      : " + studentName);
        System.out.println("Roll No   : " + rollNumber);
        System.out.println("Class     : " + className);
        System.out.println("Grades    : ");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("  Subject " + (i + 1) + ": " + grades[i]);
        }
        System.out.println("Average   : " + average);
        System.out.println("Final Grade: " + grade);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        GradeCard gc = new GradeCard();
        gc.inputStudentInfo();
        gc.calculateAverageAndGrade();
        gc.displayGradeCard();
    }
}
