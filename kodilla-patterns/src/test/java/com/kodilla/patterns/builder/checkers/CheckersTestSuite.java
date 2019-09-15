package com.kodilla.patterns.builder.checkers;

import org.junit.Assert;
import org.junit.Test;

public class CheckersTestSuite {

    @Test
    public void testCheckersBuilder(){

        //Given
        Checkers checkers = new Checkers.CheckersBuilder()
                .PlayerOne("Angie")
                .PlayerTwo("Natka")
                .Figure("PAWN", "WHITE", 0,0)
                .Figure("PAWN", "BLACK", 2,0)
                .Figure("PAWN", "WHITE", 1,6)
                .Figure("QUEEN", "WHITE", 8,8)
                .Figure("PAWN", "WHITE", 2,4)
                .Figure("PAWN", "WHITE", 3,3)
                .Figure("PAWN", "BLACK", 3,5)
                .Figure("PAWN", "BLACK", 7,0)
                .Figure("PAWN", "WHITE", 8,1)
                .Figure("PAWN", "WHITE", 8,0)
                .build();
        System.out.println(checkers.getBoard().toString());
        //When
        Figure figureOne = checkers.getBoard().getFigure(0,0);
        //Then
        Assert.assertEquals(Figure.WHITE, figureOne.getColor());

    }


}


