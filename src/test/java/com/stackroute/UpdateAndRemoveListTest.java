package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateAndRemoveListTest {
    private static UpdateAndRemoveList updateAndRemoveList;

    @Before
    public void setUp() throws Exception {
        updateAndRemoveList = new UpdateAndRemoveList();
    }

    @After
    public void tearDown() throws Exception {
        updateAndRemoveList=null;
    }
    @Test
    public void givenListShouldReturnUpdatedList()
    {
        List<String> listin = new ArrayList<String>();
        listin.add("Apple");
        listin.add("Grape");
        listin.add("Melon");
        listin.add("Berry");
        List<String> listout = new ArrayList<String>();
        listout.add("Kiwi");
        listout.add("Grape");
        listout.add("Mango");
        listout.add("Berry");
        listin=updateAndRemoveList.updateList(listin,"Apple","Kiwi");
        listin=updateAndRemoveList.updateList(listin,"Melon","Mango");
        assertEquals(listout,listin);
        List<String> list2= new ArrayList<String>();
        assertEquals(list2,updateAndRemoveList.removeList(listin));
        listin=null;
        assertNull(updateAndRemoveList.updateList(listin,"Apple","Kiwi"));
    }
    @Test
    public void givenListShouldReturnUpdatedListFailure()
    {
        List<String> listin = new ArrayList<String>();
        listin.add("Apple");
        listin.add("Grape");
        listin.add("Melon");
        listin.add("Berry");
        List<String> listout = new ArrayList<String>();
        listout.add("Kiwi");
        listout.add("Grape");
        listout.add("Melon");
        listout.add("Berry");
        listin=updateAndRemoveList.updateList(listin,"Apple","Kiwi");
        listin=updateAndRemoveList.updateList(listin,"Melon","Mango");
        assertNotEquals(listout,listin);
        assertNotNull(updateAndRemoveList.updateList(listin,"Apple","Kiwi"));
    }
}
