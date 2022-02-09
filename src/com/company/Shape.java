package com.company;

public class Shape {
    private String color;
    private boolean filled;
    public Shape() {
        set_color("green");
        set_filled(true);
    }
    public Shape(String color, boolean filled){ //если нет
        set_color(color);
        set_filled(filled);
    }
    public void set_color(String color){
        this.color = color;
    }

    public String get_color(){
        return this.color;
    }
    public void set_filled(boolean filled){
        this.filled = filled;
    }
    public boolean get_filled(){
        return this.filled;
    }
    @Override
    public String toString(){
        if(this.filled) {
            return "A shape with color of " + this.color + " and filled";
        }
            return "A shape with color of " + this.color + " and not filled";
        }
}

