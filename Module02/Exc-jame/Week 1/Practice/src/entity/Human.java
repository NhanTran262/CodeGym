package entity;

import java.util.Objects;

public class Human implements Comparable<Human> {

    private int age;
    private int doDepTrai;
    private int point;
    private int tien;

    public Human(int age, int doDepTrai, int point, int tien) {
        this.age = age;
        this.doDepTrai = doDepTrai;
        this.point = point;
        this.tien = tien;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDoDepTrai() {
        return doDepTrai;
    }

    public void setDoDepTrai(int doDepTrai) {
        this.doDepTrai = doDepTrai;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getTien() {
        return tien;
    }

    public void setTien(int tien) {
        this.tien = tien;
    }

    @Override
    public int compareTo(Human o) {
        return this.doDepTrai - o.doDepTrai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return tien == human.tien;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, doDepTrai, point, tien);
    }
}
