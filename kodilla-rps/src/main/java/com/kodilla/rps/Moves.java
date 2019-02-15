package com.kodilla.rps;

public class Moves {

    private String move;

    public Moves (String move) {
        this.move = move;
    }

    public String showMoves(){
        String strMove;
        switch (move) {
            case "1":
                strMove= "rock";
                break;
            case "2":
                strMove= "paper";
                break;
            case "3":
                strMove= "scissors";
                break;
            case "n":
                strMove= "new game";
                break;
            case "x":
                strMove= "exit";
                break;
            default:
                strMove= "wrong choice";
        }
        return strMove;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Moves moves = (Moves) o;

        return move != null ? move.equals(moves.move) : moves.move == null;
    }






}
