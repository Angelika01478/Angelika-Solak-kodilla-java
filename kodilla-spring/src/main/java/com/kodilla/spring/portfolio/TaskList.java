package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<String> tasks ;

    public TaskList() {
        tasks= new ArrayList<>();
    }

    public boolean addTask(String taskName){
       return tasks.add(taskName);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
