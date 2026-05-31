package list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {

    public static void main(String[] args){
        List<Integer> second =  Arrays.asList(10,50,30,40);
        System.out.println("Original List is : " +second);
        Collections.reverse(second);
        System.out.println("Reversed List is : " +second);

    }
}
