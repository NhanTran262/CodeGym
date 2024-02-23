package QuanLyDiem;

public class TestDiem {
    public static void main(String[] args) {
        // Khởi tạo đối tượng khoa toán
        KhoaToan toan1 = new KhoaToan("Tý","02354");
        toan1.tinhDTB();

        KhoaAnh anh1 = new KhoaAnh("Tèo","12358");
        anh1.tinhDTB();
    }
}
