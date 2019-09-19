package com.stackroute;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        if(student.getAge()==t1.getAge()) {
            if (student.getName().equals(t1.getName())) {
                return student.getId()-t1.getId();
            }
            return student.getName().compareTo(t1.getName());
        }

        return t1.getAge()-student.getAge();
    }
}
