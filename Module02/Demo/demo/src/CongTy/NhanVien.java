package CongTy;

public abstract class NhanVien {
    protected String ten;
    protected String que;
    protected int cccd;
    protected double luongCoBan = 850;


    //constructor alt ins


    public NhanVien(String ten, String que, int cccd) {
        this.ten = ten;
        this.que = que;
        this.cccd = cccd;
    }

//    public double tinhLuong(){
//        return luongCoBan;
//    }

    public abstract double tinhLuong();
}