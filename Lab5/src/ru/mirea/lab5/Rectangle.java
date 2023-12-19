package ru.mirea.lab5;

import java.math.*;
public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        this.filled = false;
        this.color = "yellow";
        this.length = 1;
        this.width = 2;
    }
    public Rectangle(double width, double length){
        this.filled = false;
        this.color = "yellow";
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String color,
                     boolean filled){
        this.filled = filled;
        this.color = color;
        this.length = length;
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return this.length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return width*2+length*2;
    }
    @Override
    public String toString() {
        return "Shape: rectangle, width: "+this.width+
                ", length: "+this.length+", color: "+this.color;
    }
}

