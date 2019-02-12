package com.kodilla.stream.portfolio;

import org.junit.Assert;
import org.junit.Test;
import stream.portfolio.Board;
import stream.portfolio.Task;
import stream.portfolio.TaskList;
import stream.portfolio.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.time.temporal.ChronoUnit.DAYS;


import static java.util.stream.Collectors.toList;

public class BoardTestSuite {

    public Board prepareTestData(){

        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Konrad Bridge");

        Task task1 = new Task("Microservice for takig temperature",
                "Write and test the microservice taking\n" +
                "temperature from external service",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));
        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));
        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));
        Task task5 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task task6 = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));

        //TaksLists
        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);
        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(task5);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task2);
        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(task6);
        //Board
        Board project = new Board("Project Weather Prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);

        return project;
    }

    @Test
    public void testAddTaskList(){
        //given
        Board project = prepareTestData();
        //when
        //then
        Assert.assertEquals(3, project.getTaskLists().size());
    }

    @Test
    public void testAddTaskListFindUsersTasks(){

        Board project = prepareTestData();
        User user = new User("developer1", "John Smith");
       List<Task> tasks= project.getTaskLists().stream()
                .flatMap(x->x.getTasks().stream())  //stream<Task>
                .filter(x->x.getAssignedUser().equals(user))
                .collect(toList());

        Assert.assertEquals(2, tasks.size());
        Assert.assertEquals(user, tasks.get(0).getAssignedUser());
        Assert.assertEquals(user, tasks.get(1).getAssignedUser());
    }

   /* @Test
    public void testAddTaskListFindOutdatedTasks(){
        Board project = prepareTestData();

        List<TaskList> undoneList = new ArrayList<>();
        undoneList.add(new TaskList("To do"));
        undoneList.add(new TaskList("In progress"));

       List<Task> testListOfTasks= project.getTaskLists().stream()
               .filter(undoneList::contains)
                .flatMap(x->x.getTasks().stream())
                .filter(x->x.getDeadline().isBefore(LocalDate.now()))
                .collect(toList());

       Assert.assertEquals(1, testListOfTasks.size());
        Assert.assertEquals("HQLs for analysis", testListOfTasks.get(0).getTitle());
        //Assert.assertEquals("Use Streams", testListOfTasks.get(1).getTitle());

    }*/

    @Test
    public void testCountLongTasks(){

        Board project = prepareTestData();
        List<TaskList> inProgressTasks= new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));


        long longTasks=project.getTaskLists().stream()
                .filter(taskList -> taskList.getName().contains("In progress"))
                .flatMap(x->x.getTasks().stream())
                .map(task->task.getCreated())
                .filter(date->date.compareTo(LocalDate.now().minusDays(10))<=0)
                .count();
        Assert.assertEquals(2,longTasks);

    }

    @Test
    public void testAverageDaysOfTheTasks(){
        Board project = prepareTestData();
        List<TaskList> inProgressTasks= new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));

        long sumOfDays= project.getTaskLists().stream()
                .filter(taskList -> taskList.getName().contains("In progress"))
                .flatMap(taskList -> taskList.getTasks().stream())
                .mapToLong(task-> DAYS.between(task.getCreated(), LocalDate.now()))
                .sum();



        long numberOfTasks= project.getTaskLists().stream()
                .filter(taskList -> taskList.getName().contains("In progress"))
                        .flatMap(taskList -> taskList.getTasks().stream())
                        .count();

        double average= project.getTaskLists().stream()
                .filter(taskList -> taskList.getName().contains("In progress"))
                .flatMap(taskList -> taskList.getTasks().stream())
                .mapToLong(task-> DAYS.between(task.getCreated(), LocalDate.now()))
                .average().getAsDouble();



        Assert.assertEquals(30, sumOfDays);
        Assert.assertEquals(3, numberOfTasks);
        Assert.assertEquals(10, average,0);

    }



}
