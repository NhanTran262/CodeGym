package entity;

import java.io.Serializable;

public class Admin extends User implements Serializable {

    public Admin( int userId, String username, String password) {
        super(userId, username, password);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                "} " + super.toString();
    }
}
