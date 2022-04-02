package com.company;

public class Main {

    public static void main(String[] args) {
        //TODO: Test all the cases
        Shape[] shapes = {
                new Rectangle("RandomRectangle", 3, 4),
                new Sphere("RandomSphere", 3),
                new Rectangle("RandomRectangle2", 3, 4)
        };
        ShapeUtil.sort(shapes);
        ShapeUtil.printShapes(shapes);
    }
}
