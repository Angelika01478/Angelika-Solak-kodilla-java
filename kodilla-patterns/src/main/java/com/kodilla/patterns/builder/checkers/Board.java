package com.kodilla.patterns.builder.checkers;

import java.util.Arrays;

public class Board {

    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX=8;
    Figure[][] board = new Figure[10][];

    public Board(){
        for (int i=0;i<10;i++){
            board[i] = new Figure[10];
        }
    }

    public Figure getFigure(int x, int y){
        return board[x][y];
    }

    public void setFigure(Figure figure, int x, int y){
        board[x][y]=figure;
    }

    @Override
    public String toString() {
        String result ="";
        for(int i=MIN_INDEX; i<=MAX_INDEX;i++){
            for(int k=MIN_INDEX; k<=MAX_INDEX;k++){
                if(board[i][k]==null){
                    result += "   ";
                }else {

                    result += board[i][k].getColor().equals("BLACK") ? "B" : "W";
                    result += (board[i][k]) instanceof Pawn  ? "_P" : "_Q";
                }
                result+="|";
            }
            result+="\n";
        }

        return result;

    }
}
