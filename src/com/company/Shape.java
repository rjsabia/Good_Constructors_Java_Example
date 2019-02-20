package com.company;

public class Shape {

    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Cube extends Shape {
    private int width;
    private int height;

    // 1st constructor
    public Cube(int x, int y) {
        this(x, y, 0, 0); // calls 2nd constructor
    }

    // 2nd constructor
    public Cube(int x, int y, int width, int height) {
        super(x, y); // calls constructor from parent
        this.width = width;
        this.height = height;
    }

    // Getters and Setters

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
