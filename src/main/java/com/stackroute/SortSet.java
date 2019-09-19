package com.stackroute;

import java.util.*;

public class SortSet {
    public List<String> sortSetAndReturnArrayList(HashSet<String> _set)
    {
        if(_set.isEmpty()){
            return null;
        }
        TreeSet<String> _sort=new TreeSet<>(_set);
        List<String> _sortedList=new ArrayList<>(_sort);
        return _sortedList;
    }
}
