package entity;

public class User {
    protected static int id;
    protected static String password;
    protected static String name;

    public User(int id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public User() {

    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
