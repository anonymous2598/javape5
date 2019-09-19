package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MapChangeKeyValuesTest {
    private static MapChangeKeyValues _swappedMap;

    @Before
    public void setUp() throws Exception {
        _swappedMap=new MapChangeKeyValues();
    }

    @After
    public void tearDown() throws Exception {
        _swappedMap=null;
    }
    @Test
    public void Test_ReplaceKeyValuePairs(){
        HashMap<String,String> _maps=new LinkedHashMap<>();
        _maps.put("val1","java");
        _maps.put("val2","c++");
        HashMap<String,String> _maps2=new LinkedHashMap<>();
        _maps2.put("val1","");
        _maps2.put("val2","java");
        assertEquals(_maps2,_swappedMap.returnSwappedMap(_maps));
        _maps.clear();
        _maps.put("val1","mars");
        _maps.put("val2","saturn");
        _maps2.clear();
        _maps2.put("val1","");
        _maps2.put("val2","mars");
        assertEquals(_maps2,_swappedMap.returnSwappedMap(_maps));
    }
    @Test
    public  void Test_ReplaceKeyValuePairs_Failure(){
        HashMap<String,String> _maps=new LinkedHashMap<>();
        assertNull(_swappedMap.returnSwappedMap(_maps));
    }
}