package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{

    private double height;
    private double width;

    public Square(double height) {
        this.height = height;
    }


    @Override
    public String getShapeName() {
        return "this is the square";
    }

    @Override
    public double getFiled() {
        return height*height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.height, height) == 0 &&
                Double.compare(square.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    @Override
    public String toString() {
        return getShapeName() + ". The field is equal " + getFiled();
    }




}
