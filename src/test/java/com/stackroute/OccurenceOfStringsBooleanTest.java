package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class OccurenceOfStringsBooleanTest {
    OccurenceOfStringsBoolean occurenceOfStringsBoolean;
    @Before
    public void setUp() throws Exception {
        occurenceOfStringsBoolean = new OccurenceOfStringsBoolean();
    }

    @After
    public void tearDown() throws Exception {
        occurenceOfStringsBoolean=null;
    }

    @Test
    public void givenStringReturnHashMapWithBooleanValues() {
        HashMap<String,Boolean> hm = new HashMap<>();
        hm.put("a",true);
        hm.put("b",false);
        hm.put("c",true);
        hm.put("d",false);
        assertEquals(hm,occurenceOfStringsBoolean.occurenceOfStrings(new String[]{"a","b","c","d","a","c","c"}));
        assertNull(occurenceOfStringsBoolean.occurenceOfStrings(null));
    }
    @Test
    public void givenStringReturnHashMapWithBooleanValuesFailure() {
        HashMap<String,Boolean> hm = new HashMap<>();
        hm.put("a",true);
        hm.put("b",false);
        hm.put("c",false);
        hm.put("d",false);
        assertNotEquals(hm,occurenceOfStringsBoolean.occurenceOfStrings(new String[]{"a","b","c","d","a","c","c"}));

    }
}
