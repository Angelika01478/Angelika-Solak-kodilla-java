package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumberExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        ArrayList<Integer> emptyList2 = new ArrayList<>();
        Assert.assertEquals(emptyList2, result );
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(5);
        testList.add(5);
        testList.add(7);
        testList.add(8);
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(testList);
        System.out.println("Testing normal list");
        //Then
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(2);
        normalList.add(8);
        Assert.assertEquals(result,normalList);


    }

}
