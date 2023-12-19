package ru.mirea.lab8_1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.UIManager.getColor;

class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), 2 * radius, 2 * radius);
    }
}
