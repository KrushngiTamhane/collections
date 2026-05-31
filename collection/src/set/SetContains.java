package set;

import java.util.HashSet;
import java.util.Set;

public class SetContains {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();

        set.add(10);

        System.out.println(set.contains(10));
    }
}
