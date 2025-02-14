package listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesWhilePreservingOrder {

    public static <T> List<T> removeDuplicates(List<T> list){
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static void main(String[] args) {
        List<Integer> inputList= Arrays.asList(3,1,2,2,3,4);
        List<Integer> outputList= removeDuplicates(inputList);
        System.out.println(outputList);
    }
}
