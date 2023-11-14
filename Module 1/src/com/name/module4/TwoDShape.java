package com.name.module4;

public abstract class TwoDShape {
    double width;
    double height;
    color colour;

    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public TwoDShape() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract double getArea();

    public color color () {
        return colour;
    }
}

