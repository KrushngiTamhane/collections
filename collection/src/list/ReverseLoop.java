package list;

import java.util.Arrays;
import java.util.List;

public class ReverseLoop {
    public static void main(String[] args) {
        List<Integer> second = Arrays.asList(10, 50, 30, 40);
        System.out.println("Original List is : " +second);
        int j = second.size();
        System.out.println("size " +j);
        for(int i = second.size()-1 ; i>-1; --i){
            System.out.println("Reversed List is : " +second.get(i));
        }
    }
}
