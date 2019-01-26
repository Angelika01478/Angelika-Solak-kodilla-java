package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{

    private double height;
    private double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String getShapeName() {
        return "This is a triangle.";
    }

    @Override
    public double getFiled() {
        return height*width/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.height, height) == 0 &&
                Double.compare(triangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }
}
