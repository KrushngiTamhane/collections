package map;

import java.util.HashMap;
import java.util.Map;

public class IterateHAshMap {
    public static void main(String[] args){
        Map<Integer,String> map =
                new HashMap<>();

        map.put(1,"Java");
        map.put(2,"Spring");

        for(Map.Entry<Integer,String> entry :
                map.entrySet()) {

            System.out.println(
                    entry.getKey()
                            +" "
                            +entry.getValue());
        }
    }
}
