package stream;

import stream.beautifier.PoemBeautifier;
import stream.beautifier.*;
import stream.lambda.*;
import stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        System.out.println("Calculating expressions with lambdas");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> b - a);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);


        System.out.println("Calculating expressions with method reference");
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::subtractBfromA);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::devidesAByB);


        System.out.println("Some excercises with poem beautify");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("something", str -> "ABC" + str + "ABC");
        poemBeautifier.beautify("something", str -> str.toUpperCase());
        poemBeautifier.beautify("something", str -> {
            String newStr = "";
            for (int i = str.length(); i >= 1; i--) {
                newStr = newStr.concat(str.substring(i - 1, i));
            }
            return newStr;
        });
        poemBeautifier.beautify("something", str -> {
            String newStr = "";
            for(int i=0; i<str.length();i++){
                if(i%2==0){
                    newStr=newStr.concat(str.substring(i,i+1).toUpperCase());
                }else{
                    newStr=newStr.concat(str.substring(i,i+1).toLowerCase());
                }
            }
            return newStr;
                }


                );

    }

}
