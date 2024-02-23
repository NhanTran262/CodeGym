package entity;

public class Seller extends User {
    private String nameStore;
    private String doanhSo;

    public Seller() {
        super(id, password, name);
        this.nameStore = nameStore;
        this.doanhSo = doanhSo;
    }

    public String getNameStore() {
        return nameStore;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public String getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(String doanhSo) {
        this.doanhSo = doanhSo;
    }

    @Override
    public String toString() {
        return "Seller{" +

                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", nameStore='" + nameStore + '\'' +
                ", doanhSo=" + doanhSo +
                '}';
    }
}
