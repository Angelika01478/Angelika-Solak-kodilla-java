package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {

    @Test

    public void testToString(){

        //given

        //create toDoList
        TasksList toDoList = new TasksList("toDoList");
        IntStream.iterate(1, n->n+1)
                .limit(10)
                .forEach(n->toDoList.getTasks().add(new Task("to do task number " + n)));

         //create inProgress
        TasksList inProgressList = new TasksList("inProgressList");
        IntStream.iterate(1, n->n+1)
                .limit(10)
                .forEach(n->inProgressList.getTasks().add(new Task("in progress task number " + n)));

        //create doneList
        TasksList doneList = new TasksList("doneList");
        IntStream.iterate(1, n->n+1)
                .limit(10)
                .forEach(n->doneList.getTasks().add(new Task("done task number " + n)));


        Board board = new Board("My task board");
        board.getLists().add(toDoList);
        board.getLists().add(inProgressList);
        board.getLists().add(doneList);

        //making a shallow clone of object board
        Board cloneBoard= null;
        try {
            cloneBoard = board.shallowCopy();
            cloneBoard.setName("Project Number 2");
        } catch (CloneNotSupportedException e ){
            System.out.println(e);
        }

        Board deepClonedBoard=null;
        try{
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project nr 3");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }


        System.out.println(board);
        System.out.println(cloneBoard);
        System.out.println(deepClonedBoard);
        //when
        board.getLists().remove(toDoList);
        //then
        Assert.assertEquals(2, board.getLists().size());
        Assert.assertEquals(2, cloneBoard.getLists().size());
        Assert.assertEquals(3, deepClonedBoard.getLists().size());
        Assert.assertEquals(cloneBoard.getLists(), board.getLists());
    }

}
