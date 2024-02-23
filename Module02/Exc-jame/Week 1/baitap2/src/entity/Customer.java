package entity;

public class Customer extends User {
    private long soDu;

    public Customer() {
        super(id, password, name);
        this.soDu = soDu;
    }

    public long getSoDu() {
        return soDu;
    }

    public void setSoDu(long soDu) {
        this.soDu = soDu;
    }

    @Override
    public String toString() {
        return "Customer{" +

                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", soDu=" + soDu +
                '}';
    }
}
