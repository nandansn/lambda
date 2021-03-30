package com.learn.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;


public class ConstructorReferenceExample {

    interface NameInterface {
        public List<String> addNames();
    }

    interface EmployeeInterface {
        public Employee create(String name, int age);
    }

    public static class Employee {
        String name;
        int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public interface PrintInterface {
        void print(Employee e);
    }

    public static void main(String[] args) {
        NameInterface names = ArrayList::new;
        EmployeeInterface employeeInterface = ConstructorReferenceExample.Employee::new;

        PrintInterface call =  (Employee e) -> {
            System.out.println(e.toString());
        };
        call.print(employeeInterface.create("nanda",40));

    }
}
