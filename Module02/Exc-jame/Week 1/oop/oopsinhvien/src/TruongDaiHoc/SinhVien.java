package TruongDaiHoc;

public class SinhVien {
    //khởi tạo thuộc tính( giống biến)
    private String hoTen;
    private double diem;

    //constructor mặc định
    //khởi tạo giá trị mặc định
    //ngay khi đối tượng vừa đc tạo ra
    public SinhVien(){
        hoTen = "No name";
        diem = 0.0;
    }

    //constructer có đối số


    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    //phương thức( các hàm )
    //phương thức ko có kiểu trả về
    public void hienThiThongTin(){
        System.out.println(hoTen+" : "+diem);
    }
    //get & set

    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}
