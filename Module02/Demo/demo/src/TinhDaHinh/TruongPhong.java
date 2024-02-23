package TinhDaHinh;

public class TruongPhong extends NhanSu{
    public TruongPhong(String ten, String cccd, String que) {
        super(ten, cccd, que);
    }

    public TruongPhong(String ten, String cccd) {
        super(ten, cccd);
    }

    public TruongPhong() {
    }

    @Override
    public double tinhLuong(int ngayCong) {
        return 50*ngayCong;
    }
}
