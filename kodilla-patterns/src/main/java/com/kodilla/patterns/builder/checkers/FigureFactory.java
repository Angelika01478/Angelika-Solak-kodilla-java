package com.kodilla.patterns.builder.checkers;

public final class FigureFactory {

    public static final String PAWN = "PAWN";
    public static final String QUEEN = "QUEEN";

    public static Figure makeFigure(final String figure, final String color){
            switch (figure){
                case QUEEN:
                    return new Queen(color);
                case PAWN:
                    return new Pawn(color);
                 default:throw new IllegalStateException("You can play also QUEEN or PAWN figure");
        }
    }


}
