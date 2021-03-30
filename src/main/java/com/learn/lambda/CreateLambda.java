package com.learn.lambda;

public class CreateLambda {

    public interface Greeting {
        void greet(String s);
    }

    public void myGreeting(String s, Greeting g) {
        g.greet(s);
    }

    public static void main(String[] args) {

        Greeting g = (s) ->System.out.println("hi ".concat(s));
        g.greet("nanda");

        new CreateLambda().myGreeting("Nandakumar Rangasamy",g);
    }

}
