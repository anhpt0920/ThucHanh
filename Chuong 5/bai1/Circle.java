package bai1;
public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter and Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Override phương thức toString()
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + getArea() +
                '}';
    }
}

