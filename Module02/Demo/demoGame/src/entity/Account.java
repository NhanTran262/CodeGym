package entity;

public abstract class Account {

    private long id;

    private String username;

    private String password;

    public Account() {
    }

    public Account(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Account id(int i) {
        this.id = i;
        return this;
    }

    public Account name(String username) {
        this.username = username;
        return this;
    }

    public Account password(String password) {
        this.password = password;
        return this;
    }

    public Account build() {
        return this;
    }
}
