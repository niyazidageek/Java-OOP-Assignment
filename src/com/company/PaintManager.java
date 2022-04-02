package com.company;

public class PaintManager {
    public static Shape[] getPaintedShapes(Shape[] shapes, int nbCans, double vol){
        double totalVolume = nbCans*vol;
        Shape[] paintedShapes = new Shape[0];
        for (Shape shape:shapes) {
            if(shape.getArea()<=totalVolume){
                totalVolume-=shape.getArea();
                Shape[] tempArr = new Shape[paintedShapes.length+1];
                for (int index = 0; index < paintedShapes.length; index++) {
                    tempArr[index] = paintedShapes[index];
                }
                tempArr[tempArr.length-1] = shape;
                paintedShapes = tempArr;
            }
        }
        return paintedShapes;
    }
}
