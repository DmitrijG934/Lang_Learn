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

    Box(double width, double height) {
        this(width, height, 0.0);
    }

    Box(double width, double height, double depth) {
        count++;
        id = count;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        System.out.println("Volume of Box # " + id + ":");
        return width * height * depth;
    }

    @Override
    public String toString() {
        return String.format("Box #%d\nWidth: %.2f\nHeight: %.2f\nDepth: %.2f",
                id, this.width, this.height, this.depth);
    }

    protected void finalize() {
        System.out.println("Box with id " + id + " was deleted");
    }

    public static void main(String[] args) {
        Box box = new Box(10, 20, 15);
        box.finalize();
        box.volume();
    }

}
