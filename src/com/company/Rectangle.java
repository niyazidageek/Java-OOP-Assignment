package com.company;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height){
        super(name);
        this.width = width;
        this.height = height;
        super.setType(this.getClass().getSimpleName());
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public String toString(){
        return String.format("%s: %s - [%.2f,%.2f]", super.getType(), super.getName(), width, height);
    }
}
