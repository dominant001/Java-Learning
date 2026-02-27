package SolidDesignPrincipal;

public class OCP {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(5, 10),
                new Circle(7)
        };
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateArea(shapes);
        System.out.println("Total Area: " + totalArea);
    }
}

// This class is open for extension but closed for modification
class AreaCalculator {
    public double calculateArea(Shape[] shapes) { // used to get the total area covered by all the shapes
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}