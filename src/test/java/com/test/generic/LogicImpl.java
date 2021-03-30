package com.test.generic;

import java.util.ArrayList;
import java.util.List;

public class LogicImpl {

    public void getList(ArrayList<? extends Person> persons) {
        persons.forEach(System.out::println);
    }

    public void setList(List<? super Student> students) {

    }
}
