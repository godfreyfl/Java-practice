package ru.mirea.lab4;

class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // площадь
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // длина
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

