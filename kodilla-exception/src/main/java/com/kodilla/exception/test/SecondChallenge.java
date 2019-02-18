package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyWillThrowException(double x, double y) throws InvalidValueException{
        if (x>=2|| x<1 || y==1.5){
            throw  new InvalidValueException("Wrong value!");
        }
        return "Done!";
    }

}

class InvalidValueException extends Exception{
    public InvalidValueException(String message) {
        super(message);
    }
}