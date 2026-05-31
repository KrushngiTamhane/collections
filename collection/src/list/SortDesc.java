package list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDesc {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,5,4,2,3);

        List<Integer> sorted =
                list.stream()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());

        System.out.println(sorted);
    }
}
