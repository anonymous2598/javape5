package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfStringsBoolean {
    public HashMap<String, Boolean> occurenceOfStrings(String str[])
    {
        if(str==null){return null;}
        HashMap<String,Boolean> hm = new HashMap<>();
        HashMap<String,Integer> hms = new HashMap<>();
        for(int i=0;i<str.length;i++)
        {
            if(hms.containsKey(str[i])){
                hms.put(str[i], hms.get(str[i]) + 1);
            }
            else
            {
                hms.put(str[i],1);
            }
        }
//        System.out.println(hms);
        for (Map.Entry<String,Integer> entry : hms.entrySet())
        {
            if(entry.getValue()>=2)
            {
                hm.put(entry.getKey(),true);
            }
            else
            {
//                System.out.println(entry.getValue());
                hm.put(entry.getKey(),false);
            }
        }
        return hm;
    }
}
