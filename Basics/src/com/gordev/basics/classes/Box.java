package com.gordev.basics.classes;

public class Box {

    private int id;
    private static int count;
    private double width;
    private double height;
    private double depth;

    static {
        count = 0;
    }

    Box() {
        this(0.0, 0.0, 0.0);
    }

    public Box(double width, double height) {
        this(width, height, 0.0);
    }

    public Box(double width, double height, double depth) {
        count++;
        id = count;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }



    @Override
    public String toString() {
        return String.format("Box #%d\nWidth: %.2f\nHeight: %.2f\nDepth: %.2f",
                id, this.width, this.height, this.depth);
    }

    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box(10.0, 6.3);
        Box box2 = new Box(100.0, 67.8, 30.42);
        System.out.println(box);
        System.out.println(box1);
        System.out.println(box2);
    }

}
