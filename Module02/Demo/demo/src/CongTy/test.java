package CongTy;

public class test {
    public static void main(String[] args) {
//        NhanVien nv1 = new NhanVien("Ánh","Hồ Chí Minh",2365987);
//        double luongnv1 = nv1.tinhLuong();
//        System.out.println("Lương nv1 là: "+luongnv1);

        //Tạo đối tượng nhân viên hành chính
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("Hồng","Bến Tre",8956412);
        double luonghc1 = hc1.tinhLuong();
        System.out.println("Lương HC1 là: "+luonghc1);

        //Tạo ối tươợng nhân viên đi ca
        NhanVienDiCa k1 = new NhanVienDiCa("Giang","Hà Nội",5632147,1);
        double luongk1 = k1.tinhLuong();
        System.out.println("Lương k1 là: "+luongk1);
        System.out.println(k1.ca);

        NhanVienDiCa k2 = new NhanVienDiCa("Tí","Hải Phòng",5632147,2);
        double luongk2 = k2.tinhLuong();
        System.out.println("Lương k2 là: "+luongk2);
        System.out.println(k2.ca);
    }

}
