package com.kodilla.spring.shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class ShapesFactory {
    @Bean
    public Square createSquare(){
        return new Square();
    }

    @Bean
    public Shape chosenShape(){
        Random generator = new Random();
        int number = generator.nextInt(3);
        Shape theShape;
        if(number ==0){
            theShape=new Triangle();
        }else if (number==1){
            theShape = new Circle();
        }else  {
            theShape = new Square();}
        return theShape;
        }
}
