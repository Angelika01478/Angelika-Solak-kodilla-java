package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;
import stream.array.ArrayOperations;

import java.util.Random;


public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        int[] testNumbers = new int[10];
        int sum =0;
        Random genetator = new Random();
        for(int i=0; i<10; i++){
            testNumbers[i] = genetator.nextInt(10000);
            sum+=testNumbers[i];
        }

        double expectedAverage= (double) sum/testNumbers.length;
        double calculatedAverage= ArrayOperations.getAverage(testNumbers);

        Assert.assertEquals(expectedAverage, calculatedAverage,0);

    }

}
