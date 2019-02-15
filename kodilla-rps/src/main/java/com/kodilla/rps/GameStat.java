package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class GameStat {

    private List<GameResults> results = new ArrayList<>();

    public void addResult(GameResults gameResults){
        results.add(gameResults);
    }

    public int countUserPoint(){
        return results.stream()
                .mapToInt(x->x.getUserPoint())
                .sum();
    }

    public  int countComputerPoint(){
       return results.stream()
                .mapToInt(x->x.getComputerPoint())
                .sum();
    }

    public String showTheWinner(){
        if(countComputerPoint()>countUserPoint()){
            return "\nComputer is the winner !!!";
        }
        if(countUserPoint()>countComputerPoint()){
            return "\nYou are the winner !!!";
        }else {
            return "\nTie !!!";
        }
    }

    public List<GameResults> getResults() {
        return results;
    }

    public static void showAllStatistics(List<GameResults> someList){
        someList.stream()
                .map(x->x.toString())
                .forEach(System.out::println);

    }



}
