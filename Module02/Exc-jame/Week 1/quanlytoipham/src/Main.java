import entity.ToiPham;
import service.QuanLyService;
import service.ToiPhamService;

public class Main {
    public static void main(String[] args) {
//        ToiPham kietLon = new ToiPham("Kiệt lớn",22,"Linh hoạt","undefine");
//        ToiPham kietNho = new ToiPham("Kiệt nhỏ",18,"Male","undefine");
//        ToiPham thos = new ToiPham();
//        String result = thos.danh("ca vat");
//        System.out.println(kietLon);
//        System.out.println(kietNho);

//        QuanLyService quanLyService = new QuanLyService();
//        quanLyService.traluong();
        ToiPhamService toiPhamService = new ToiPhamService();
        ToiPham thang = new ToiPham("Thắng",23,"Nam","undefined");
        thang.setName("Thắng");
        toiPhamService.themToiPham(thang,0);
        ToiPham kietLon = new ToiPham("Kiệt lớn",22,"Nam","undefined");
        toiPhamService.themToiPham(kietLon,1);
        ToiPham kietNho = new ToiPham("Kiệt nhỏ",19,"Nam","undefined");
        toiPhamService.themToiPham(kietNho,2);
        toiPhamService.InDanhSachToiPham();

    }
}