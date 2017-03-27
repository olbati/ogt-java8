package com.olbati.java8;

/**
 * Created by awahab.
 */
public class LambdaExpressionApp {
    @FunctionalInterface
    interface OperationEntiere {
        long effectuer(int a, int b);
    }

    public long calculer(int a, int b, OperationEntiere operation) {
        return operation.effectuer(a, b);
    }
    public static void main(String[] args) {
        LambdaExpressionApp lambdaExpressionApp = new LambdaExpressionApp();
        OperationEntiere addition = (a, b) -> a + b;
        OperationEntiere soustraction = (a, b) -> a - b;
        System.out.println(lambdaExpressionApp.calculer(10, 5, addition));
        System.out.println(lambdaExpressionApp.calculer(10, 5, soustraction));
    }
}
