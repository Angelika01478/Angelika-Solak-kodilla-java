package com.kodilla.hibernate.manytomany.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kodilla.hibernate.manytomany.Employee;

@Repository
@Transactional
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    List<Employee> searchByLastName(@Param("LASTNAME") String lastName);


}