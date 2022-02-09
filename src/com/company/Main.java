package com.company;

public class Main {

    public static void main(String[] args) {
	Shape shape1 = new Shape();
    Shape shape2 = new Shape("red", false);
        Circle circle1 = new Circle(2, "blue", true);
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2,3);
        Rectangle rectangle3 = new Rectangle(2, 3, "red", false);
        Square square1 = new Square();
        Square square2 = new Square(3, "black", false);
        System.out.println(square1);
        System.out.println(square2);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(circle1);
        System.out.println(shape1);
        System.out.println(shape2);

    }

}
