package com.kodilla.rps;

import java.util.Random;

public class Computer {

    private int choice;
    Random generaror = new Random();

    public void setCompChoice(){
        choice = generaror.nextInt(3)+1;
    }


    public String getCompChoice(){
        Moves moves = new Moves(Integer.toString(choice));
        return moves.showMoves();
    }

}
