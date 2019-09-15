package com.kodilla.patterns.builder.checkers;

public class Checkers {

    private final Board board;
    private final String playerOne;
    private final String playerTwo;

    private Checkers(Board board, String playerOne, String playerTwo) {
        this.board = board;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public Board getBoard() {
        return board;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public static class CheckersBuilder{

        private static Board board = new Board();
        private static String playerOne;
        private static String playerTwo;



        public CheckersBuilder Figure(String type, String color, int x, int y){

            if(x > board.MAX_INDEX || x< board.MIN_INDEX || y >board.MAX_INDEX || y< board.MIN_INDEX){
                throw new IllegalStateException("You play on 9 x 9 board!");
            }

            if(board.getFigure(x,y)==null){
                board.setFigure(FigureFactory.makeFigure(type, color), x, y);
            }else throw  new IllegalStateException("Position " + x + "," + y + " is already occupied");

            return this;
        }

        public CheckersBuilder PlayerOne(String playerOne){
            this.playerOne=playerOne;
            return this;
        }

        public CheckersBuilder PlayerTwo(String playerTwo){
            this.playerTwo=playerTwo;
            return this;
        }

        public Checkers build(){
            if(playerOne.length()==0){
             throw new IllegalStateException("There are no PlayerOne");
            }
            if(playerTwo.length()==0){
                throw new IllegalStateException("There are no PlayerTwo");
            }
            boolean white =false, black = false;
            for(int i=Board.MIN_INDEX; i<Board.MAX_INDEX;i++){
                for(int k=Board.MIN_INDEX; k<Board.MAX_INDEX;k++){
                    Figure figure = board.getFigure(i,k);
                    if(figure!=null){
                        if(figure.getColor().equals(figure.WHITE)){
                            white=true;
                        }else black=true;
                    }
                }
            }

            if(!(black && white)){
                throw new IllegalStateException("There are no figures of the both colors on the board");
            }
            return new Checkers(board, playerOne, playerTwo);
        }


    }


}
