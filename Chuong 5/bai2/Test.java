package bai2;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng Exchange
        Exchange exchange = new Exchange();

        // Thêm dữ liệu từ MonArr
        exchange.addRate("USD", "VND", 17000);
        exchange.addRate("EUR", "USD", 1.2);
        exchange.addRate("USD", "IDN", 15789);
        exchange.addRate("USD", "EUR", 0.83);
        exchange.addRate("CAD", "IDN", 16869);

        // Đọc dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập mã tiền tệ thứ nhất: ");
        String code1 = scanner.nextLine();

        System.out.print("Mời nhập mã tiền tệ thứ hai: ");
        String code2 = scanner.nextLine();

        System.out.print("Mời nhập lượng tiền cần chuyển đổi: ");
        double amount = scanner.nextDouble();

        // Thực hiện chuyển đổi
        double result = exchange.convert(code1, code2, amount);
        if (result != -1) {
            System.out.println("Lượng tiền sau khi đổi: " + result);
        }

        scanner.close();
    }
}