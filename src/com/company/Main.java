package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Rectangle r1 = new Rectangle("r1", 3, 5);
        Rectangle r2 = new Rectangle("r2", 2, 7);
        Rectangle r3 = new Rectangle("my_rect", 5, 5);

        Sphere s1 = new Sphere("s1", 3);
        Sphere s2 = new Sphere("s2", 6);
        Sphere s3 = new Sphere("ball", 5);

        Shape[] shapes = new Shape[] { s2, r1, s1, r2, s3, r3 };

        System.out.println("***Printing all the shapes***");
        ShapeUtil.printShapes(shapes);

        // TODO: uncomment the next two lines, test your sort method.
         ShapeUtil.sort(shapes);
         ShapeUtil.printShapes(shapes);
        // Comment them out then.

        System.out.println("***Printing the shapes that could be painted\n\tgiven the #cans and value of each can***");

        System.out.print("Enter number of cans: ");
        int nbCans = scan.nextInt();

        System.out.print("Enter volume of each can: ");
        int vol = scan.nextInt();

        ShapeUtil.printShapes(PaintManager.getPaintedShapes(shapes, nbCans, vol));

        System.out.println("***Finding and printing the shapes based on the given name***");

        System.out.print("Enter the name you search for: ");

        String name = scan.next();

        Shape res = ShapeUtil.findShapeByName(shapes, name);
        System.out.println(name +": "+ res);

        System.out.println("ball: " + ShapeUtil.findShapeByName(shapes, "ball"));
        System.out.println("rect: " + ShapeUtil.findShapeByName(shapes, "rect"));

        scan.close();
    }
}
