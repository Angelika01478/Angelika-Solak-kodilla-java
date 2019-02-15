package com.kodilla.rps;

public class FindTheWinner {


    public static int findTheWinner(String firstMove, String secondMove) {
        if (firstMove.equals(secondMove)) return 0;

        switch (firstMove) {
            case "rock":
                return (secondMove.equals("scissors") ? 1 : -1);
            case "paper":
                return (secondMove.equals("rock") ? 1 : -1);
            case "scissors":
                return (secondMove.equals("paper") ? 1 : -1);

        }
        return -2;
    }

    public static void showTheWinner(int result) {

        switch (result) {
            case 0:
                System.out.println("This is a tie");
                break;
            case 1:
                System.out.println("You win!");
                break;
            case -1:
                System.out.println("Computer win");
                break;
            default:
                System.out.println("Something went wrong");
        }
    }

}