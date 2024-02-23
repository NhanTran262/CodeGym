import TruongDaiHoc.SinhVien;

public class bai30_OOP1 {
    public static void main(String[] args) {
        //khỏi tạo đối tượng thuộc class TruongDaiHoc.SinhVien
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Tèo");
//        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien("Tí",9.5);
//        sv4.hienThiThongTin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        System.out.println(sv3.getHoTen());
        System.out.println(sv3.getDiem());

        //thay đổi tên sv4
//        sv4.setHoTen("black");
//        sv4.setDiem(3.5);
//        sv4.hienThiThongTin();

    }
}
