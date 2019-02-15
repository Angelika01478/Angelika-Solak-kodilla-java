package com.kodilla.rps;

import java.util.Scanner;

public class Player {

    private Scanner playerMove;
    private String move;



    public Player() {
        playerMove= new Scanner(System.in);
    }

    public void setPlayerMove(){
        move=playerMove.nextLine();
    }

    public String getPlayerMove(){
        Moves moves= new Moves(move);
        return moves.showMoves();
    }


}
