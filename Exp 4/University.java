public class University {
    private static String universityName = "UPES"; 
    private String studentName; 

    public University(String studentName) {
        this.studentName = studentName;
    }

    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    public static void main(String[] args) {
        University student1 = new University("Kush");
        University student2 = new University("Adwita");

        University.displayUniversityName();
        System.out.println(student1.studentName + " is enrolled at " + universityName + ".");
        System.out.println(student2.studentName + " is enrolled at " + universityName + ".");
    }
}