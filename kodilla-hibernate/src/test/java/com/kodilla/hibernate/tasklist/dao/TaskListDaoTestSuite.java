package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

}
