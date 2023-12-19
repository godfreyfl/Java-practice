package ru.mirea.lab1;

public class Ball {
    private String colour;
    private int diameter;

     public Ball(String colour, int diameter) {
         this.colour = colour;
         this.diameter = diameter;
     }

     public Ball(String c) {
         colour = c;
         diameter = 30;
     }

     public Ball() {
         colour = "white";
         diameter = 30;
     }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Ball{" + "colour = '" + colour + '\'' + ", diameter = " + diameter + "cm" + '}';
    }
}
