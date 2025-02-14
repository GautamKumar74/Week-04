package listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateElementsInAList {
    public static <T> void rotateList(List<T> list, int k){
        int n= list.size();
        k= k%n;
        if(k==0) return;

        List<T> rotated= new ArrayList<>();
        rotated.addAll(list.subList(k,n));
        rotated.addAll(list.subList(0,k));

        list.clear();
        list.addAll(rotated);
    }

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int k= 2;
        System.out.println("Original List: "+ list);
        rotateList(list,k);
        System.out.println("Rotated List: "+ list);
    }
}
