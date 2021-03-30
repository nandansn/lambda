package com.learn.lambda;

public class MethodReferenceExample {

    int a;
    int b;

    public MethodReferenceExample(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public interface IMethodRef {
        public void calc(int a, int b);
    }



    public static void sum(int a, int b) {
        System.out.println(a+ b);
    }

    public void testSum() {
        IMethodRef iref = MethodReferenceExample::sum;
        iref.calc(this.a,this.b);
    }



    public static void main(String[] args) {
        IMethodRef iref = MethodReferenceExample::new;
        iref.calc(10,12);
    }
}
