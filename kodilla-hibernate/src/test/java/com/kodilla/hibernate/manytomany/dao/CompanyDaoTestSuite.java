package com.kodilla.hibernate.manytomany.dao;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;


    @Test
    public void testSaveManyToMany(){
        //Given
        Employee janKowalski = new Employee("jan", "kowalski");
        Employee janinaNowak = new Employee("janina", "nowak");
        Employee lucyWilska = new Employee("lucy", "wilska");

        Company company1 = new Company("company1");
        Company company2 = new Company("company2");
        Company company3 = new Company("company3");

        company1.getEmployees().add(janKowalski);
        company2.getEmployees().add(janinaNowak);
        company1.getEmployees().add(janKowalski);
        company3.getEmployees().add(lucyWilska);

        janKowalski.getCompanies().add(company1);
        janKowalski.getCompanies().add(company3);
        janinaNowak.getCompanies().add(company2);
        lucyWilska.getCompanies().add(company3);
        //When
        companyDao.save(company1);
        int id1 = company1.getId();

        companyDao.save(company2);
        int id2 = company2.getId();

        companyDao.save(company3);
        int id3 = company3.getId();
        //Then
        Assert.assertNotEquals(0, company1);
        Assert.assertNotEquals(0, company2);
        Assert.assertNotEquals(0, company3);
        //CleanUp
        try {
            companyDao.deleteById(id1);

            companyDao.deleteById(id2);

            companyDao.deleteById(id3);
        }catch (Exception e){

        }
    }


    @Test
    public void testNamedQueries(){
        //Given
        Employee janKowalski = new Employee("jan", "kowalski");
        Employee janinaNowak = new Employee("janina", "nowak");
        Employee lucyWilska = new Employee("lucy", "wilska");

        Company company1 = new Company("samsung");
        Company company2 = new Company("lenovo");
        Company company3 = new Company("stateStreet");

        company1.getEmployees().add(janKowalski);
        company2.getEmployees().add(janinaNowak);
        company1.getEmployees().add(janKowalski);
        company3.getEmployees().add(lucyWilska);

        janKowalski.getCompanies().add(company1);
        janKowalski.getCompanies().add(company3);
        janinaNowak.getCompanies().add(company2);
        lucyWilska.getCompanies().add(company3);
        //When
        companyDao.save(company1);
        int id1 = company1.getId();

        companyDao.save(company2);
        int id2 = company2.getId();

        companyDao.save(company3);
        int id3 = company3.getId();

        List<Employee> byLastName =employeeDao.searchByLastName("kowalski");
        List<Company> byKey =companyDao.searchByKey("sam");

        Assert.assertEquals("kowalski", byLastName.get(0).getLastName());
        Assert.assertEquals("samsung", byKey.get(0).getName());

        try{
            companyDao.deleteById(id1);
            companyDao.deleteById(id2);
            companyDao.deleteById(id3);
        }catch (Exception e){

        }

    }
}
