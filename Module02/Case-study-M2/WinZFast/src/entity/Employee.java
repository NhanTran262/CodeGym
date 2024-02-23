package entity;

import constant.EDepartment;
import constant.EPosition;

import java.io.Serializable;

public class Employee extends User implements Serializable {
    private EDepartment department;
    private EPosition position;
    private long salary;

    public Employee(int userId, String username, String password, String name, EDepartment department, EPosition position, long salary) {
        super(userId, username, password, name);
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public EDepartment getDepartment() {
        return department;
    }

    public void setDepartment(EDepartment department) {
        this.department = department;
    }

    public EPosition getPosition() {
        return position;
    }

    public void setPosition(EPosition position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
