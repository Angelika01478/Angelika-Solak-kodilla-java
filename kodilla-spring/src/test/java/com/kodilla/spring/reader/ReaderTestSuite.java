package com.kodilla.spring.reader;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReaderTestSuite {

    @Test
    public void testRead() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        Reader reader =context.getBean(Reader.class);
        //When
        reader.read();

        //Then
    }

    @Test
    public void testCondition(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);

        //When
        boolean book2Exists=context.containsBean("book2");

        //then
        System.out.println("Bean book2 was found " + book2Exists);
    }

}
