package bai1;
import java.util.ArrayList;

public class CircleCollection {
    private ArrayList<Circle> circles;

    // Constructor
    public CircleCollection() {
        this.circles = new ArrayList<>();
    }

    // Thêm một hình tròn
    public void addCircle(Circle c) {
        circles.add(c);
    }

    // Lấy hình tròn tại vị trí pos
    public Circle getCircle(int pos) {
        if (pos >= 0 && pos < circles.size()) {
            return circles.get(pos);
        }
        return null;
    }

    // Thiết lập giá trị tại vị trí pos
    public void setCircle(int pos, Circle c) {
        if (pos >= 0 && pos < circles.size()) {
            circles.set(pos, c);
        }
    }

    // Tính tổng diện tích
    public double calcSumArea() {
        double sum = 0;
        for (Circle c : circles) {
            sum += c.getArea();
        }
        return sum;
    }

    // Tìm diện tích nhỏ nhất
    public double findMinArea() {
        if (circles.isEmpty()) return 0;

        double min = circles.get(0).getArea();
        for (Circle c : circles) {
            if (c.getArea() < min) {
                min = c.getArea();
            }
        }
        return min;
    }

    // Tìm diện tích lớn nhất
    public double findMaxArea() {
        if (circles.isEmpty()) return 0;

        double max = circles.get(0).getArea();
        for (Circle c : circles) {
            if (c.getArea() > max) {
                max = c.getArea();
            }
        }
        return max;
    }

    // Override toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Circle Collection:\n");
        for (Circle c : circles) {
            sb.append(c).append("\n");
        }
        return sb.toString();
    }
}
