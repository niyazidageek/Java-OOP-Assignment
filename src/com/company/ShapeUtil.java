package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class ShapeUtil {
    static void sort(Shape[] shapes){
        Arrays.sort(shapes, Comparator.comparing(Shape::getType));
    }

    static void printShapes(Shape[] shapes){
        System.out.println(Arrays.toString(shapes));
    }

    static Shape findShapeByName(Shape[] shapes, String name){
        Optional<Shape> foundShape = Arrays.stream(shapes)
                .filter(s->s.getName() == name).findFirst();
        if(foundShape.isEmpty())
            return null;
        return foundShape.get();
    }
}
