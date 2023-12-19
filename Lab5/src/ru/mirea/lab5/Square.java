package ru.mirea.lab5;

public class Square extends Rectangle{
    public Square(){
        setFilled(false);
        setColor("red");
    }
    public Square(double side){
        setFilled(false);
        setColor("red");
        this.width = side;
        this.length = side;
    }
    public Square(double side, String color, boolean filled){
        setFilled(false);
        setColor("red");
        this.width = side;
        this.length = side;
    }
    public double getSide(){
        return this.width;
    }
    public void setSide(double side){
        this.width = side;
        this.length = side;
    }
    @Override
    public void setWidth(double side){
        this.width = side;
    }
    @Override
    public void setLength(double side){
        this.length = side;
    }
    @Override
    public String toString() {
        return "Shape: square, side: "+this.width+
                ", color: "+this.color;
    }

}

