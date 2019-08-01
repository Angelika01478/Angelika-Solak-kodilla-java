package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

   @Test
    public void CalculatorTestSuite(){
        //Given
       ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
       Calculator calculator = context.getBean(Calculator.class);
       //When
       double result1=calculator.add(2,5);
       double result2=calculator.sub(10,6.5);
       double result3=calculator.mul(5,2);
       double result4= calculator.div(5,0.5);
       double result5= calculator.div(5,0);
       //Then
       Assert.assertEquals(7, result1, 0);
       Assert.assertEquals(3.5,result2,0);
       Assert.assertEquals(10,result3,0);
       Assert.assertEquals(10,result4,0);
       Assert.assertEquals(0, result5,0);
    }

}
