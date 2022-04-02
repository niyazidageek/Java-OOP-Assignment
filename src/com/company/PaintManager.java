package com.company;

public class PaintManager {
    static Shape[] getPaintedShapes(Shape[] shapes, double canVolume, int canNumber){
        double totalVolume = canVolume*canNumber;
        int paintedShapeCount = 0;
        Shape[] paintedShapes = new Shape[0];
        for (Shape shape:shapes) {
            if(shape.getArea()<=totalVolume){
                totalVolume-=shape.getArea();
                paintedShapeCount++;
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
