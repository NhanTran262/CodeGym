package Enum;

import java.util.PrimitiveIterator;

public class SinhVien {
    //Khởi tạo thuộc tính
    private int ma;
    private String ten;
    private double DTB;
    private XepLoai loai;

    //constructor

    public SinhVien(int ma, String ten, double DTB) {
        this.ma = ma;
        this.ten = ten;
        this.DTB = DTB;
        this.loai = getLoai();
    }

    //phương thức để get loại
    public XepLoai getLoai() {
        if (this.DTB >= 8) {
            loai = XepLoai.gioi;
        } else if (this.DTB >= 6.5) {
            loai = XepLoai.kha;
        } else if (this.DTB >= 5.0) {
            loai = XepLoai.tb;
        } else if (this.DTB >= 3.0) {
            loai = XepLoai.yeu;
        } else {
            loai=XepLoai.duoihoc;
        }
        return loai;
    }

    //to String

    @Override
    public String toString() {
        return ma+ "\t" +ten+ "\t" +this.loai.des();
    }
}

