package entity;

public class ToiPham {
private  String name;
private int age;
private String sex;
private String toidanh;


public String danh(String tool){
    return "Danh bang"+tool;
}


    public ToiPham(){
    name = "Kiet";
    age = 22;
    sex = "male";
    toidanh = "undefine";
}
public ToiPham(String name){
        this.name = name;
}

    public ToiPham(String name, int age, String sex, String toidanh) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.toidanh = toidanh;
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

    public String getToidanh() {
        return toidanh;
    }

    public void setToidanh(String toidanh) {
        this.toidanh = toidanh;
    }

    @Override
    public String toString() {
        return "entity.ToiPham{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", toidanh='" + toidanh + '\'' +
                '}';
    }

}
