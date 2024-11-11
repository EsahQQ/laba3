package com.lab3;
public class Plant {
    String name;
    double height;
    int old;
    public Plant(String name, double height, int old) {
        this.name = name;
        this.height = height;
        this.old = old;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public int getOld() {
        return this.name;
    }
    public void setOld(int old) {
        this.old = old;
    }
    public abstract void hello();
}
