package list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DifferenceOfList {
    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(3,4);

        List<Integer> diff =
                list1.stream()
                        .filter(e -> !list2.contains(e))
                        .collect(Collectors.toList());

        System.out.println(diff);
    }
}
