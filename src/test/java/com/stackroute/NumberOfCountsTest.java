package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class NumberOfCountsTest {
    private static NumberOfCounts numberOfCounts;

    @Before
    public void setUp() throws Exception {
        numberOfCounts=new NumberOfCounts();
    }

    @After
    public void tearDown() throws Exception {
        numberOfCounts=null;
    }

    @Test
    public void givenStringShouldReturnHashMapOfNumberOfOccurences()
    {
        HashMap<String,Integer> hms = new HashMap<>();
        hms.put("one",5);
        hms.put("two",2);
        hms.put("three",2);
        assertEquals(hms,numberOfCounts.numberOfCounts("one one -one___two,,three,one @three*one?two"));
        assertNull(numberOfCounts.numberOfCounts(null));
    }
    @Test
    public void givenStringShouldReturnHashMapOfNumberOfOccurencesFailure()
    {
        HashMap<String,Integer> hms = new HashMap<>();
        hms.put("one",5);
        hms.put("two",3);
        hms.put("three",2);
        assertNotEquals(hms,numberOfCounts.numberOfCounts("one one -one___two,,three,one @three*one?two"));
        assertNotNull(numberOfCounts.numberOfCounts("one  two _three"));
    }
}
