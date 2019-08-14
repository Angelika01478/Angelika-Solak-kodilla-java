package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {


    @Bean(name ="ToDoList")
    public TaskList getToDoList(){
        return new TaskList();
    }

    @Bean(name ="InProgressList")
    public TaskList getInProgressList(){
        return new TaskList();
    }


    @Bean(name ="DoneList")
    public TaskList getDoneList(){
        return new TaskList();
    }

    @Bean
    public Board getBoard(){
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }


}
