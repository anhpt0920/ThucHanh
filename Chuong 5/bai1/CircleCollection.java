package bai1;
public class TestCircle {
    public static void main(String[] args) {
        // Tạo một số hình tròn
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(7.5);

        // In thông tin
        System.out.println(c1);
        System.out.println(c2);

        // Thay đổi bán kính
        c1.setRadius(10.0);
        System.out.println("After changing radius: " + c1);
    }
}
