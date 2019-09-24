package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task, Integer> {


    Optional<Task> findById(Integer id);

    List<Task> findByDuration(int duration);

    @Override
    void deleteById(Integer integer);
}
