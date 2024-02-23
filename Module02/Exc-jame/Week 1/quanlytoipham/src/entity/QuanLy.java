package entity;

public class QuanLy {
    private String name;
    private int age;
    private String sex;
    private String chucvu;
    private long vitien;

    public QuanLy(long vitien){
        this.vitien = vitien;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public long getVitien() {
        return vitien;
    }

    public void setVitien(long vitien) {
        this.vitien = vitien;
    }
}
