package com.company;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        //TODO: Test all the cases
        Shape[] shapes = {
                new Rectangle("RandomRectangle", 3, 4),
                new Sphere("RandomSphere", 3),
                new Rectangle("RandomRectangle2", 3, 4)
        };
        ShapeUtil.sort(shapes);
        ShapeUtil.printShapes(PaintManager.getPaintedShapes(shapes,30,2));

    }
}
