package main;

import main.interfaces.StringLengthLambda;

public class LambdaLearnings {
    public static void main(String[] args) {
        printLambda(String::length);
    }


    public static void printLambda(StringLengthLambda lambda) {
        System.out.println(lambda.getLength("Hi KAJOL"));
    }


}
