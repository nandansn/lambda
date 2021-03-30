package com.test.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGenerics {

    public static void main(String[] args) {
        new LogicImpl().getList(new ArrayList<>(Arrays.asList(new Person("nanda"),new Person("kumar"))));

        List<? super Student> studentList = new ArrayList<Student>();

        new LogicImpl().setList(studentList);

    }
}
