package com.codegym.model;

public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int increment() {
        return count++;
    }
}
