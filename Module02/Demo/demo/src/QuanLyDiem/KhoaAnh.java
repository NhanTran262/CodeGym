package QuanLyDiem;

public class KhoaAnh extends NamHoc2023{
    public KhoaAnh(String ten, String cccd) {
        super(ten, cccd);
    }
    //Override

    @Override
    public void tinhDTB() {
        System.out.println("Đây là pt tính DTB của khoa Anh: ");
    }
}
