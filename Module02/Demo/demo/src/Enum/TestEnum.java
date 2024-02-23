package Enum;

import java.util.ArrayList;

public class TestEnum {
    public static void main(String[] args) {
        //Kiểm tra thứ tự giá trị trong Enum
        System.out.println(XepLoai.kha.ordinal());
        System.out.println(XepLoai.yeu.ordinal());

        //Tọa List danh sách
        ArrayList<SinhVien> ds = new ArrayList<>();

        //Tạo đối tượng sinh viên
        SinhVien sv1 = new SinhVien(1,"Tý",9.5);
        SinhVien sv2 = new SinhVien(2,"Tèo",4.5);
        SinhVien sv3 = new SinhVien(3,"Thanh",7.5);

        //Add danh sách sinh viên vào list
        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);

        //Duyệt danh sách
        for (SinhVien ttsinhvien : ds){
            System.out.println(ttsinhvien);
        }
    }
}
