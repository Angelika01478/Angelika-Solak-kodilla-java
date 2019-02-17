package com.kodilla.rps;

import java.util.List;
import java.util.Scanner;

public class Game {

    private Scanner input;
    Player player = new Player();
    Computer computer=new Computer();

    public Game(){
        input =new Scanner(System.in);
    }

    public boolean newGame(){
        System.out.println("Are you sure you want to end the current game and start again (Y/N)?");
        String answer=input.nextLine();
        if (answer.charAt(0)=='Y')
        {
            startGame();
            return true;
        }
        return false;
    }

    public boolean exitGame(){
        System.out.println("Are you sure you want to end the current game and exit? (Y/N)");
        String answer=input.nextLine();
        if(answer.charAt(0)=='Y') {
            return true;
        }
        return false;
    }

    public boolean playerStartTheMove(){
        player.setPlayerMove();
        if(player.getPlayerMove()=="new game") {
            if(newGame()) {
                return true;
            }else {
                player.setPlayerMove();
            }

        }
        if (player.getPlayerMove()=="exit") {
            if(exitGame()) {
                return false;
            }else {
                player.setPlayerMove();
            }
        }
        return true;
    }


    public List<GameResults> startGame(){
        int currentRound=0;
        GameStat gameStat = new GameStat();

        System.out.println("Input your name...");
        FindInfoFromUser findInfoFromUser= new FindInfoFromUser();
        findInfoFromUser.setUserName();
        System.out.println("Hello " + findInfoFromUser.getUserName());
        System.out.println("Input the number of rounds");
        findInfoFromUser.setChosenNumberOfRound();
        if (findInfoFromUser.getNumberOfRound()>0){
            System.out.println("You chose " + findInfoFromUser.getNumberOfRound() + "\n");
            System.out.println("Ruls: \n");
            System.out.println("button 1- play a \"rock\"");
            System.out.println("button 2- play a \"paper\"");
            System.out.println("button 3- play a \"scissors\"");
            System.out.println("button x- end the game");
            System.out.println("button n- play again\n");
        }
        while (currentRound!=findInfoFromUser.getNumberOfRound()){

            if(!playerStartTheMove()) break;

            System.out.println("You chose: " + player.getPlayerMove());

                while (player.getPlayerMove()=="wrong choice") {
                    System.out.println("Please choose again");
                    playerStartTheMove();
                    System.out.println("You chose: " + player.getPlayerMove());
                }

            computer.setCompChoice();
            System.out.println("Computer chose: " + computer.getCompChoice());
            FindTheWinner.showTheWinner(FindTheWinner.findTheWinner(player.getPlayerMove(), computer.getCompChoice()));

            gameStat.getResults().add(new GameResults(currentRound, FindTheWinner.findTheWinner(player.getPlayerMove(), computer.getCompChoice())));

            currentRound++;

        }
        System.out.println("The game is over \n");
        System.out.println(gameStat.showTheWinner());
        return gameStat.getResults();
    }







}
