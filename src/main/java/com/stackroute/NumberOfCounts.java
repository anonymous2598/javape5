package com.stackroute;

import java.util.HashMap;

public class NumberOfCounts {
    public HashMap<String, Integer> numberOfCounts(String str){
        if(str==null){return null;}
        HashMap<String,Integer> hm = new HashMap<>();

        String s[] = str.split("[ -_+,+ @+*+?+.+!+]+");

        for(int i=0;i<s.length;i++)
        {
           if(hm.containsKey(s[i])){
               hm.put(s[i], hm.get(s[i]) + 1);
           }
           else
           {
               hm.put(s[i],1);
           }
        }
        return hm;
    }
}
