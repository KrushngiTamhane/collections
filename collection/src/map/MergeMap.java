package map;

import java.util.HashMap;
import java.util.Map;

public class MergeMap {
    public static void main(String[] args){
        Map<Integer,String> map1 =
                new HashMap<>();

        map1.put(1,"Java");

        Map<Integer,String> map2 =
                new HashMap<>();

        map2.put(2,"Spring");

        map1.putAll(map2);

        System.out.println(map1);
    }
}
