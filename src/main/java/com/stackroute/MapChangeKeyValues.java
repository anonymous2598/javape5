package com.stackroute;

import java.util.HashMap;

public class MapChangeKeyValues {
    public HashMap<String,String> returnSwappedMap(HashMap<String,String> hmin)
    {
        if(hmin.size()!=2){return null;}
        String str= hmin.get("val1");
        if(str==null){return null;}

            hmin.replace("val2",str);
            hmin.replace("val1","");
        return hmin;
    }
}
