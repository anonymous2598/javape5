package com.stackroute;

import java.util.Collections;
import java.util.List;

public class Student {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<Student> sort_objects(List<Student> _list){
        Collections.sort(_list,new StudentSorter());
        return _list;
    }
    private int id ,age;
    private String name;
}
