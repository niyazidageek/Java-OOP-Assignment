package com.company;

public class Sphere extends Shape{
    Sphere(String name, double radius){
        super(name);
        this.radius = radius;
    }

    double radius;

    double getRadius(){
        return radius;
    }

    void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4*Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString(){
        return String.format("%s: %s - [%.2f]", type, name, radius);
    }
}
