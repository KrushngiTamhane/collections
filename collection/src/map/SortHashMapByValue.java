package map;

import java.util.HashMap;
import java.util.Map;

public class SortHashMapByValue {
    public static void main(String[] args){
        Map<Integer,String> map =
                new HashMap<>();

        map.put(3,"A");
        map.put(1,"C");
        map.put(2,"B");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
