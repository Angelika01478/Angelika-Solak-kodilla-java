package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge=new SecondChallenge();

        try {
            secondChallenge.probablyWillThrowException(3,0);
        }catch (InvalidValueException ex){
            System.out.println(ex.toString());
        } finally {
            System.out.println("The operation has ended.");
        }
    }

}