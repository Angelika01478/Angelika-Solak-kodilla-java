package com.kodilla.patterns.factory;

public class Rectange  implements Shape{

    final String name;
    final double width;
    final double length;

    public Rectange(String name, double width, double length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getCircumference() {
        return 2*width+2*length;
    }
}
