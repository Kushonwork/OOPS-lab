public class Student {
    private String name;
    private int age;

    
    public Student() {
        this.name = "Kush";
        this.age = 20;
    }

    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student student1 = new Student(); // Default constructor
        Student student2 = new Student("Alice", 22); // Parameterized constructor

        student1.displayDetails();
        student2.displayDetails();
    }
}