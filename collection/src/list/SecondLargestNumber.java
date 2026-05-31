package list;

import java.util.*;

public class SecondLargestNumber {

    public static void main(String[] args){
        List<Integer> second =  Arrays.asList(100, 20, 100, 50);
        Collections.sort(second);
        System.out.println("Second Largest number is : " +second.get(second.size()-2));

    }
}
