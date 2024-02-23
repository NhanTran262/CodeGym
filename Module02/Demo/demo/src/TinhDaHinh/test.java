package TinhDaHinh;

public class test {
    public static void main(String[] args) {
        NhanSu ns1 = new PhoPhong("TÝ","66666","HCM"); //ctrl+p
        //xuất lương phó phòng
        System.out.println(ns1.tinhLuong(21));
        System.out.println("ns1 đang là phó phòng");
        System.out.println(ns1.getTen()+ " : "+ns1.getCccd());
       //thay đổi chức vụ
         ns1 = new TruongPhong(ns1.getTen(), ns1.getCccd(), ns1.getQue());
         //xuất lương ns1 khi làm trưởng phòng
        System.out.println(ns1.tinhLuong(21));
        System.out.println("ns1 đang là trưởng phòng");
        System.out.println(ns1.getTen()+ " : "+ns1.getCccd());
    }
}
