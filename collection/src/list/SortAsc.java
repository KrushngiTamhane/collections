package list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortAsc {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(5,3,2,1);

        List<Integer> sorted =
                list.stream()
                        .sorted()
                        .collect(Collectors.toList());

        System.out.println(sorted);
    }
}
