package com.company;

public class Sphere extends Shape{
    private double radius;

    public Sphere(String name, double radius){
        super(name);
        this.radius = radius;
        this.setType(this.getClass().getSimpleName());
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double getArea() {
        return 4*Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString(){
        return String.format("%s: %s - [%.2f]", this.getType(), this.getName(), radius);
    }
}
