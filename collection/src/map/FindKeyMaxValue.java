package map;

import java.util.Collections;
import java.util.Map;

public class FindKeyMaxValue {
    public static void main(String[] args){
        Map<String,Integer> map =
                Map.of("A",10,"B",50,"C",20);

        String key =
                Collections.max(
                        map.entrySet(),
                        Map.Entry.comparingByValue()
                ).getKey();

        System.out.println(key);
    }
}
