package com.kodilla.rps;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {


        Game game = new Game();
       // game.startGame();
        GameStat.showAllStatistics(game.startGame());

    }

}
