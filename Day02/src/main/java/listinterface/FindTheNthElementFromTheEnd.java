package listinterface;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class FindTheNthElementFromTheEnd {

    public static <T> T findNthFromEnd(LinkedList<T> list, int n){
        if(list==null || n<=0){
            throw new IllegalArgumentException("Invalid input");
        }

        Iterator<T> fast= list.iterator();
        Iterator<T> slow= list.iterator();

        for(int i=0; i<n; i++){
            if(!fast.hasNext()){
                throw new IllegalArgumentException("N is larger than the list size");
            }
            fast.next();
        }

        while (fast.hasNext()){
            fast.next();
            slow.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        int n= 2;
        System.out.println(findNthFromEnd(list,n));
    }
}
