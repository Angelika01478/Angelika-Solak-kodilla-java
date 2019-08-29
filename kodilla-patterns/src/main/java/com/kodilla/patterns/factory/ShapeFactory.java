package com.kodilla.patterns.factory;

public final class ShapeFactory {

    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";
    public static final String RECTANGLE = "RECTANGLE";


    public  Shape makeShape(final String shapeClass){
        switch (shapeClass){
            case CIRCLE :
                return new Circle("small circle", 4.50);
            case SQUARE :
                return new Square("average square", 7.0);
            case RECTANGLE :
                return new Rectange("big rectangle", 15.0, 2.5);
            default:
                return null;
        }
    }

}



