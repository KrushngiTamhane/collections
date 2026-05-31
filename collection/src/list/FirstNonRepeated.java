package list;

import java.util.*;

public class FirstNonRepeated {
    public static void main(String[] args){
        List<String> repeat = Arrays.asList("A", "B", "C", "A", "B");
        List<String> output = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0;i<repeat.size();i++){
            map.put(repeat.get(i), i);
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue()  == 1){
                output.add(String.valueOf(entry.getValue()));
            }

        }
        System.out.println("Value:"+output);
    }
}
