package com.company;

public class Square extends  Rectangle{
    public Square(){
    }
    public Square(double side){
        set_length(side);
    }
    public Square(double side, String color, boolean filled){
        set_length(side);
        set_color(color);
        set_filled(filled);
    }
    @Override
    public String toString() {
        return "A Square with side=" + get_length() + ", which is a subclass of " + super.toString();
    }
    public double get_perimeter(){
        return(4*get_length());
    }
    public double get_area() {
        return(Math.pow(get_length(), 2));
    }
    public void set_length(double length) {
        super.set_length(length);
        super.set_width(length);
    }
    public void set_width(double width) {
        super.set_length(width);
        super.set_width(width);
    }
}
