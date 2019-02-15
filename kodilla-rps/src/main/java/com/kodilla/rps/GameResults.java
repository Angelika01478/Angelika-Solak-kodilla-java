package com.kodilla.rps;

public final class GameResults {

    private final int roundNumber;
    private final int point;
    private final int userPoint;
    private final int computerPoint;

    public GameResults(final int roundNumber,final int point) {
        this.roundNumber = roundNumber;
        this.point = point;
        switch (point){
            case 0: {
                userPoint=0;
                computerPoint=0;
                break;
            }
            case 1: {
                userPoint=1;
                computerPoint=0;
                break;
            }
            case -1:{
                computerPoint=1;
                userPoint=0;
                break;
            }
            default:{
                computerPoint=0;
                userPoint=0;
            }
        }
    }


    public int getRoundNumber() {
        return roundNumber;
    }

    public int getPoint() {
        return point;
    }

    public int getUserPoint() {
        return userPoint;
    }

    public int getComputerPoint() {
        return computerPoint;
    }

    @Override
    public String toString() {
        return "GameResults{" +
                "roundNumber=" + roundNumber +
                ", userPoint=" + userPoint +
                ", computerPoint=" + computerPoint +
                '}';
    }
}
