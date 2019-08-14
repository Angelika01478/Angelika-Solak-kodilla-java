package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    private static final String resultToDoList = "It is my task to do";
    private static final String resultInProgressList = "It is my task in progress";
    private static final String resultDoneList = "It is my done task";

    @Test
    public void testTaskAdd(){

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        TaskList toDoList= context.getBean("ToDoList",TaskList.class);
        TaskList inProgressList= context.getBean("InProgressList",TaskList.class);
        TaskList doneList= context.getBean("DoneList",TaskList.class);

        toDoList.addTask(resultToDoList);
        inProgressList.addTask(resultInProgressList);
        doneList.addTask(resultDoneList);

        Board board = context.getBean(Board.class);

        Assert.assertNotNull( "empty toDoList", board.getToDoList().getTasks());
        Assert.assertEquals(resultToDoList , board.getToDoList().getTasks().get(0));

        Assert.assertNotNull( "empty inProgressList", board.getInProgressList().getTasks());
        Assert.assertEquals( resultInProgressList ,board.getInProgressList().getTasks().get(0));

        Assert.assertNotNull( "empty doneList", board.getDoneList().getTasks());
        Assert.assertEquals(resultDoneList, board.getDoneList().getTasks().get(0));

    }

}
