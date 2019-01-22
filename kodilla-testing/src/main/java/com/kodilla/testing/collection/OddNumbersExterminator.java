package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate (ArrayList<Integer> numbers){
        ArrayList<Integer> onlyEvenNumbers= new ArrayList<Integer>();

        for(Integer el : numbers){
            if (el%2==0){
                onlyEvenNumbers.add(el);
            }
        }
        return onlyEvenNumbers;
    }

}
