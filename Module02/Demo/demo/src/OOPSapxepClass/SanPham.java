package OOPSapxepClass;

public class SanPham implements Comparable<SanPham>{

    //Thuộc tính
private int ma;
private String ten;
private double gia;
//constructor
    public SanPham(int ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }
//get và set
    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    //to String
    @Override
    public String toString() {
        return "SanPham{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                '}';
    }
//Sắp xếp theo ký tự
    @Override
    public int compareTo(SanPham o) {
        return this.ten.compareToIgnoreCase(o.ten);
    }
//Phương thức
//    //Sắp xếp theo giá
//    @Override
//    public int compareTo(SanPham o) {
//        if(this.gia <o.gia)
//            return -1;
//        if(this.gia>o.gia)
//            return 1;
//        return 0;
//    }
}
