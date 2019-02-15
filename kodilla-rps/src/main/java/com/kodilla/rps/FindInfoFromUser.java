package com.kodilla.rps;

import java.util.Scanner;

public class FindInfoFromUser {

    private Scanner userNameInput;
    private Scanner chosenNumberOfGames;
    private String userName;
    private int numberOfRound;


    public FindInfoFromUser(){
        userNameInput=new Scanner(System.in);
        chosenNumberOfGames=new Scanner(System.in);

    }


    public void setUserName(){
        userName=userNameInput.nextLine();
    }

    public String getUserName(){
        return userName;
    }


    public int getNumberOfRound(){
        return numberOfRound;
    }

    public void setChosenNumberOfRound(){
        String numberOfRoundsTemp = chosenNumberOfGames.nextLine();
        if (isInteger(numberOfRoundsTemp)){
           numberOfRound=Integer.parseInt(numberOfRoundsTemp);
        }
        else System.out.println("Please input only integer value");
    }




    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }


}
