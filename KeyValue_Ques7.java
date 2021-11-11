package java8_Lamda;

import java.util.HashMap;
import java.util.Map;

public class KeyValue_Ques7 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(33,"Max");
        map.put(11,"Sergio");
        map.put(10,"Gasly");

        StringBuilder result=new StringBuilder();

        map.forEach((k, v) -> result.append(k).append(v));
        System.out.println(result + "\n");
        
    }
    
}

