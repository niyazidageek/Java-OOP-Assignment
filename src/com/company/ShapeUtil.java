package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class ShapeUtil {
    static void sort(Shape[] shapes){
        Arrays.sort(shapes, Comparator.comparing(Shape::getType));
    }

    static void printShapes(Shape[] shapes){
        System.out.println(Arrays.toString(shapes));
    }
}
