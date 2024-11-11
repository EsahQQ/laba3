package com.lab3;
public class Beautibloom extends Plant {
    double bloom;
    public Beautibloom(String name, double height, int old, double bloom) {
        super(name, height, old);
        this.bloom = bloom;
    }
    public double getBloom() {
        return this.bloom;
    }
    public void setName(double bloom) {
        this.bloom = bloom;
    }
}
