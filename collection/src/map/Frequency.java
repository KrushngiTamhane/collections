package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Frequency {
    public static void main(String[] args){
        List<String> list =
                Arrays.asList("Java","Java","Spring");

        Map<String,Integer> map =
                new HashMap<>();

        for(String s : list){
            map.put(s,
                    map.getOrDefault(s,0)+1);
        }

        System.out.println(map);
    }
}
