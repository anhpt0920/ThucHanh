package bai2;
import jva.util.ArrayList;
class Exchange {
    ArrayList<Rate> rates;

    public Exchange() {
        rates = new ArrayList<>();
    }
    // Phương thức thêm tỷ giá vào danh sách
    public void addRate(String code1, String code2, double rate) {
        rates.add(new Rate(code1, code2, rate));
    }

    // Phương thức chuyển đổi
    public double convert(String code1, String code2, double amount) {
        for (Rate rate : rates) {
            if (rate.code1.equals(code1) && rate.code2.equals(code2)) {
                return amount * rate.rate;
            }
        }
        System.out.println("Không tìm thấy tỷ giá cho mã tiền tệ " + code1 + " -> " + code2);
        return -1; // Trả về -1 nếu không tìm thấy tỷ giá
    }
}