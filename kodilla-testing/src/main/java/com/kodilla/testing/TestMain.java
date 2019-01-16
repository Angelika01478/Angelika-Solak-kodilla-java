package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestMain {
    public static void main(String[] args) {
       SimpleUser simpleUser = new SimpleUser("theFormUser");
       String result =simpleUser.getUsername();

       if (result.equals("theFormUser")) {
           System.out.println("Test ok");
       }else {
           System.out.println("Error!");

        }

       Calculator calculator = new Calculator();
       int addResult = calculator.add(10,20);

       if (addResult==(10+20)){
           System.out.println("Calculator adding test ok");
       }else {
           System.out.println("Calculator adding test error!");
       }


        int subtractResult = calculator.subtract(10,20);

        if (subtractResult==(10-20)){
            System.out.println("Calculator subtracting test ok");
        }else {
            System.out.println("Calculator subtracting test error!");
        }






    }
}
