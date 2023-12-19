package ru.mirea.lab8_1;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    private Color color;
    private int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void draw(Graphics g);
}

