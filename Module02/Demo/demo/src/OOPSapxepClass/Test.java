package OOPSapxepClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        //tạo List
        ArrayList<SanPham> ds = new ArrayList<>();
        //Khởi tao các đối tượng sản phẩm
        SanPham sp1 = new SanPham(1,"SamSung",1050);
            SanPham sp2 = new SanPham(2,"Iphone",500);
        SanPham sp3 = new SanPham(3,"Nokia",800);
        //add sản phẩm vào List
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
        //Xem danh sách sản phẩm trong List
        for (SanPham sp : ds){
            System.out.println(sp);
        }

        //Gọi phương thức sắp xếp
        Collections.sort(ds);
        System.out.println("Ds sau sắp xếp: ");
        for (SanPham sp : ds){
            System.out.println(sp);
        }

















    }
}
