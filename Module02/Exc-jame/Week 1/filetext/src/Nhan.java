public class Nhan {
    private int id;
    private Integer age;
    private Float price;
    private float price1;

    public Nhan(int id, Integer age, Float price, float price1) {
        this.id = id;
        this.age = age;
        this.price = price;
        this.price1 = price1;
    }

    public Nhan() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public float getPrice1() {
        return price1;
    }

    public void setPrice1(float price1) {
        this.price1 = price1;
    }

    @Override
    public String toString() {
        return "Nhan{" +
                "id=" + id +
                ", age=" + age +
                ", price=" + price +
                ", price1=" + price1 +
                '}';
    }
}
