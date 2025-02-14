package setinterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSubsets {

    public static <T> boolean isSubset(Set<T> subset, Set<T> superset){
        return superset.containsAll(subset);
    }

    public static void main(String[] args) {
        Set<Integer> subSet= new HashSet<>(Arrays.asList(2,3));
        Set<Integer> superSet= new HashSet<>(Arrays.asList(1,2,3,4));

        boolean result= isSubset(subSet,superSet);
        System.out.println("Is Set1 a subset of Set2? " + result);
    }
}
