package com.name.module4;

public final class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private final double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public String toString() {
        return "Circle Radius = " + radius;
    }
}