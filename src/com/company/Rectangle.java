package com.company;

public class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle(){
        set_length(1.0);
        set_width(1.0);
    }
    public Rectangle(double width, double length){
        set_length(length);
        set_width(width);
    }
    public Rectangle(double width, double length, String color, boolean filled){
        set_length(length);
        set_width(width);
        set_color(color);
        set_filled(filled);
    }

    public void set_width(double width){
        this.width = width;
    }
    public void set_length(double length){
        this.length = length;
    }
    public double get_width(){
        return this.width;
    }
    public double get_length(){
        return this.length;
    }
    public double get_perimeter(){
        return(2*(get_length()+get_width()));
    }
    public double get_area(){
        return(get_length()*get_width());
    }
    @Override
    public String toString() {
        return "A Rectangle with width= " + get_width() + " and length= " + get_length() + ", which is a subclass of " + super.toString();
    }
}
