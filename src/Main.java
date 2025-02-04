class Shape {

    // area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius; // Area of circle = πr²
    }

    // area of a rectangle
    public double calculateArea(double length, double breadth) {
        return length * breadth; // Area of rectangle = length * breadth
    }

    // area of a triangle
    public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height; // Area of triangle = 1/2 * base * height
        }
        return 0; 
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();

        // Calculate area of a circle 
        double circleArea = shape.calculateArea(5.0);
        System.out.println("Area of Circle: " + circleArea);

        // Calculate area of a rectangle 
        double rectangleArea = shape.calculateArea(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Calculate area of a triangle 
        double triangleArea = shape.calculateArea(3.0, 4.0, true);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}