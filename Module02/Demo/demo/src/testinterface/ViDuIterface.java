package testinterface;

public interface ViDuIterface {
    //tập các thuộc tính (chỉ đc phép là hằng số)
    static final double phuCap = 15;
    //các phương thức phải là trừu tượng
    public abstract void thongTin(String ten, String cccd, int namSinh);
    public abstract double tinhLuong(double luongNgay, int soNgayCong);
}
