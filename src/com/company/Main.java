package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Rectangle rectangle = new Rectangle(2, 2, 1,1);

        System.out.println("Rec Height: " + rectangle.getHeight());
        System.out.println("Rec Width: " + rectangle.getWidth());
        System.out.println("Rec X: " + rectangle.getX());
        System.out.println("Rec Y: " + rectangle.getY());

        Cube cube = new Cube(4, 4, 4, 4);

        System.out.println("Cube Height: " + cube.getHeight());
        System.out.println("Cube Width: " + cube.getWidth());
    }
}
