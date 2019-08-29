package com.kodilla.patterns.factory.tasks;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaskFactoryTestSuite {
    TaskFactory task;
    @Before
    public void beforeEveryTest(){
        task = new TaskFactory();
    }
    @Test
    public void testShoppingTask(){
        //when
        Task shoppingTask = task.makeTask("SHOPPING_TASK");
        //then
        Assert.assertEquals("grocery shopping" , shoppingTask.getTaskName());
        Assert.assertFalse(shoppingTask.isTaskExecuted());
        shoppingTask.executeTask();
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }


    @Test
    public void testPaintingTask(){
        //when
        Task paintingTask = task.makeTask("PAINTING_TASK");
        //then
        Assert.assertEquals("fence painting", paintingTask.getTaskName());
        Assert.assertFalse(paintingTask.isTaskExecuted());
        paintingTask.executeTask();
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask(){
        //when
        Task drivingTask = task.makeTask("DRIVING_TASK");
        //then
        Assert.assertEquals("way to work", drivingTask.getTaskName());
        Assert.assertFalse(drivingTask.isTaskExecuted());
        drivingTask.executeTask();
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }

}
