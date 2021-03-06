package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MainTest {
private static Student student;

    @Before
    public void setUp() throws Exception {
        student=new Student();
    }

    @After
    public void tearDown() throws Exception {
        student=null;
    }

    @Test
    public void givenStudentListShouldReturnSortedList() {
        Student _obj1=new Student();
        Student _obj2=new Student();
        Student _obj3=new Student();
        Student _obj4=new Student();
        Student _obj5=new Student();
        _obj1.setId(1);_obj1.setName("Prabhas");_obj1.setAge(35);
        _obj2.setId(2);_obj2.setName("Mahesh");_obj2.setAge(38);
        _obj3.setId(3);_obj3.setName("Prabhas");_obj3.setAge(28);
        _obj4.setId(4);_obj4.setName("Mahesh");_obj4.setAge(38);
        _obj5.setId(5);_obj5.setName("Rana");_obj5.setAge(35);

        List<Student> _list=new ArrayList<>();
        _list.add(_obj1);
        _list.add(_obj2);
        _list.add(_obj3);
        _list.add(_obj4);
        _list.add(_obj5);

        List<Student> _expected=new ArrayList<>();
        _expected.add(_obj2);_expected.add(_obj4);_expected.add(_obj1);_expected.add(_obj5);_expected.add(_obj3);

        assertEquals(_expected,student.sort_objects(_list));





    }
}
