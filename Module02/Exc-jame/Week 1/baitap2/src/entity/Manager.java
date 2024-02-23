package entity;

public class Manager extends User{
    private  String luong;
    public Manager() {
        super(id, password, name);
        this.luong = luong;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Manager{" +

                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", luong=" + luong +
                '}';
    }
}
