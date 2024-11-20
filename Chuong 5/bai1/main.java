package bai1;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        CircleCollection collection = new CircleCollection();
        Random random = new Random();

        // Tạo danh sách ngẫu nhiên 5 hình tròn
        for (int i = 0; i < 5; i++) {
            double radius = 1 + random.nextDouble() * 9; // Bán kính từ 1 đến 10
            collection.addCircle(new Circle(radius));
        }

        // Hiển thị danh sách
        System.out.println(collection);

        // Tính tổng diện tích
        System.out.println("Tổng diện tích: " + collection.calcSumArea());

        // Tìm diện tích nhỏ nhất
        System.out.println("Diện tích nhỏ nhất: " + collection.findMinArea());

        // Tìm diện tích lớn nhất
        System.out.println("Diện tích lớn nhất: " + collection.findMaxArea());
    }
}

