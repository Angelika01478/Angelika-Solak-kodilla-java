package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public String getShapeName() {
        return "This is the circle";
    }

    @Override
    public double getFiled() {
        return Math.PI*radius*radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return getShapeName() + ". The field is equal " + getFiled();
    }


}
