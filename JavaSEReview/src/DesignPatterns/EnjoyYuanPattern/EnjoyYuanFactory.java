package DesignPatterns.EnjoyYuanPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnjoyYuanFactory<T> {
    private Map<String,T> enjoyYuanMap=new HashMap<String,T>();
    public T getEnjoyImple(String key){
        T t=enjoyYuanMap.get(key);
        if(t==null){
            t= (T) new EnJoyYuanImple(key);
            enjoyYuanMap.put(key,t);
        }
        return t;
    }
}
