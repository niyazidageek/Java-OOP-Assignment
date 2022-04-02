package com.company;

public class Rectangle extends Shape {
    Rectangle(String name, double width, double height){
        super(name);
        this.width = width;
        this.height = height;
        this.type = this.getClass().getSimpleName();
    }

    private double width;
    private double height;

    double getWidth(){
        return width;
    }

    double getHeight(){
        return height;
    }

    void setWidth(double width){
        this.width = width;
    }

    void setHeight(double height){
        this.height = height;
    }

    public double getArea() {
        return width*height;
    }

    @Override
    public String toString(){
        return String.format("%s: %s - [%.2f,%.2f]", type, name, width, height);
    }
}
