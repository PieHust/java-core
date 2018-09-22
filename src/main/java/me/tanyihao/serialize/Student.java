package me.tanyihao.serialize;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = -3384986892882185188L;

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
