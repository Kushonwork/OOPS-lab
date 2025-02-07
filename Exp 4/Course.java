public class Course {
    private String courseName;
    private String courseCode;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName + ", Course Code: " + courseCode);
    }

    public static void main(String[] args) {
        Course course = new Course("Introduction to Programming", "CS101");
        course.displayCourseDetails();
    }
}