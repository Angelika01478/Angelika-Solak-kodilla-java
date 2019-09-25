package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LIST_NAME = "Test List";

    @Test
    public void testFindByListName(){

        //Given
        TaskList taskList = new TaskList(LIST_NAME, "Description");
        //When
        taskListDao.save(taskList);
        //Then
        Assert.assertEquals(1,taskListDao.findByListName(LIST_NAME).size());
        Assert.assertEquals(LIST_NAME, taskListDao.findByListName(LIST_NAME).get(0).getListName());
        //CleanUp
        int id = taskListDao.findByListName(LIST_NAME).get(0).getId();
        taskListDao.deleteById(id);

    }


    @Test
    public void testTaskListDaoSaveWithTasks(){
        //Given
        Task task = new Task("Task number 1", 14);
        Task task2 = new Task("Task number 2", 7);

        TaskFinancialDetails tsd = new TaskFinancialDetails(new BigDecimal(800), false);
        TaskFinancialDetails tsd2 = new TaskFinancialDetails(new BigDecimal(100), false);

        TaskList taskList = new TaskList(LIST_NAME, "ToDo Tasks");

        task.setTaskFinancialDetails(tsd);
        task2.setTaskFinancialDetails(tsd2);

        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);

        task.setTaskList(taskList);
        task2.setTaskList(taskList);
        //When
        taskListDao.save(taskList);
        int id = taskList.getId();
        //Then
        Assert.assertNotEquals(0,id);
        //ClenUp
        taskListDao.deleteById(id);
    }

}
