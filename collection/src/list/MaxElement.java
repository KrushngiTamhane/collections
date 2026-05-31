package list;

import java.util.Arrays;
import java.util.List;

public class MaxElement {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10,50,20,70);

        Integer max =
                list.stream()
                        .max(Integer::compareTo)
                        .get();

        System.out.println(max);
    }
}

/*
To find min element use min() instead of max()
 */