package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TaskListDao extends CrudRepository<TaskList, Integer> {

    List<TaskList> findByListName(String listName);

    @Override
    void deleteById(Integer integer);
}
