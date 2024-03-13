package Prototype_Registry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String,Student> studentRegistry = new HashMap<>() ;

    void register(String key,Student student){
        studentRegistry.put(key,student) ;
    }

    public Student get(String key){
        if(studentRegistry.containsKey(key)){
            return studentRegistry.get(key) ;
        }
        return null ;
    }

}
