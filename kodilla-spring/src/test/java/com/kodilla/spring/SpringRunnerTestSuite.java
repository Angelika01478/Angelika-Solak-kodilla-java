package com.kodilla.spring;

import com.kodilla.spring.shape.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuite {

    @Test
    public void testCircleLoadedIntoContainer(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Circle.class);
        //When
        String result = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a circle.", result);
    }

    @Test
    public void testTriangleLoadIntoContainer(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Triangle.class);
        //When
        String result = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a triangle.", result);
    }

    @Test
    public void tesSquareLoadIntoContainer(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Square.class);
        //When
        String result = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a square", result);

    }

    @Test
    public void testShapeLoadedIntoContainer(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //wyszukajmy beana w kontenerze
        Shape shape = (Shape)context.getBean("chosenShape");
        //When
        String result = shape.getShapeName();
        //Then
        System.out.println(result);
    }
}
