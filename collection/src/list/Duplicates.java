package list;

import java.util.*;

//Remove Duplicate from the list [1,2,3,2,4,1,5]
public class Duplicates {

    public static void main(String[] args){
        List<String> names =
                Arrays.asList(
                        "A","B","A","C","B"
                );

        Set<String> seen = new TreeSet<>();
        Set<String> duplicates = new TreeSet<>();
        for(int i = 0 ; i<names.size(); i++){
            if(!seen.add(names.get(i))){
                duplicates.add(names.get(i));
            }else{
                seen.add(names.get(i));
            }
        }
        System.out.println("After removing duplicates : "+seen);
    }
}
