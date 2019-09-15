package com.kodilla.patterns.builder.checkers;

public class Figure {

    public static final String WHITE = "WHITE";
    public static final String BLACK = "BLACK";
    final private String color;

    public Figure(String color) {
        if(color.equals("WHITE")||color.equals("BLACK")) {
            this.color = color;
        } else throw new IllegalStateException("You can play only WHITE and BLACK figures");
    }


    public String getColor() {
        return color;
    }
}
