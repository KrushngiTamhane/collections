package list;

import java.util.*;

public class Occurance {
    public static void main(String[] args){
        List<String> list =
                Arrays.asList("Java", "Spring", "Java", "Angular");
        Map<String,Integer> map = new HashMap<>();
      for(String list1 : list){
          map.merge(list1,1,Integer::sum);
      }
      System.out.println(map);
    }
}
