package setinterface;

import java.util.*;

public class ConvertASetToASortedList {

    public static <T extends Comparable<T>> List<T> convertToSortedList(Set<T> set){
        List<T> sortList= new ArrayList<>(set);
        Collections.sort(sortList);
        return sortList;
    }

    public static void main(String[] args) {
        Set<Integer> hashSet= new HashSet<>(Arrays.asList(5,3,9,1));

        List<Integer> sortedList= convertToSortedList(hashSet);
        System.out.println("Sorted List: " + sortedList);
    }
}
