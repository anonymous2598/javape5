package com.stackroute;

import java.util.List;

public class UpdateAndRemoveList {
public List<String> updateList(List<String> list,String tomodString, String modString){
    if(list==null){return  null;}
    if(tomodString==null){return list;}
    int pos = list.indexOf(tomodString);
    if(pos!=-1){
    list.set(pos,modString);}
    return list;

}
public List<String> removeList(List<String> list){
list.clear();
return list;
}
}
