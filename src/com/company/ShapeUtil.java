package com.company;
import java.util.Arrays;
import java.util.Optional;

public class ShapeUtil {
    public static void printShapes(Shape[] shapes){
        String[] result = Arrays.stream(shapes)
                .map(s->s.toString() + String.format(": %.3f", s.getArea()))
                .toArray(String[]::new);
        System.out.println(Arrays.toString(result));
    }

    public static void sort(Shape[] shapes){
        for (int i = 0; i < shapes.length; i++){
            for(int j = i + 1; j < shapes.length; j++){
                if(shapes[i].getType().compareTo(shapes[j].getType())>0){
                    swap(shapes, i, j);
                }
            }
        }
    }

    public static Shape findShapeByName(Shape[] shapes, String name){
        Optional<Shape> foundShape = Arrays.stream(shapes)
                .filter(s->s.getName().equals(name)).findFirst();
        if(foundShape.isEmpty())
            return null;
        return foundShape.get();
    }

    private static void swap(Shape[] shapes, int i, int j){
        Shape temp = shapes[i];
        shapes[i] = shapes[j];
        shapes[j] = temp;
    }
}
