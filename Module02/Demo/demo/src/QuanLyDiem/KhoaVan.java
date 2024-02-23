package QuanLyDiem;

public class KhoaVan extends NamHoc2023{
    public KhoaVan(String ten, String cccd) {
        super(ten, cccd);
    }
    //Override

    @Override
    public void tinhDTB() {
        System.out.println("Đây là pt tính DTB của khoa văn: ");
    }
}
