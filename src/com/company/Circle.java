package com.company;

public class Circle extends Shape{
    private double radius;
    public Circle(){
        set_radius(1.0);
    }
    public Circle(double radius){
        set_radius(radius);
    }
    public Circle(double radius, String color, boolean filled){
        set_radius(radius);
        set_color(color);
        set_filled(filled);
    }

    public void set_radius(double radius){
        this.radius = radius;
    }
    public double get_radius(){
        return this.radius;
    }
    public double get_area(){
        return(3.14*Math.pow(get_radius(), 2));
    }
    public double get_perimeter(){
        return(2*3.14*get_radius());
    }
    @Override
    public String toString() {
        return "A Circle with radius = " + get_radius() + ", which is subclass of " + super.toString();
    }
}
