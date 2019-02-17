package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException();
        }

        return a/b;

    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        int[][] numbers = new int[][] {{2,0}, {4,2}, {9,1}, {2,3}, {0,0}};
        int a;
        int b;
        for(int[] n : numbers) {

            a = n[0];
            b = n[1];
            double result = 0;
            try {
                result = firstChallenge.divide(a, b);
                System.out.println("the result  is equal " + result);
            } catch (ArithmeticException e) {
                System.out.println("You can not divide by 0");

            } finally {
                System.out.println("It is the result of division " + a + " / " + b);
                System.out.println("=================================");
            }

        }
    }


}
