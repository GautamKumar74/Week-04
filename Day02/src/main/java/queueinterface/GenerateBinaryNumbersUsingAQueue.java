package queueinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenerateBinaryNumbersUsingAQueue {

    public static List<String> generateBinaryNumbers(int n){
        List<String> result= new ArrayList<>();
        Queue<String> queue= new LinkedList<>();

        queue.offer("1");

        for(int i=0; i<n; i++){
            String binary= queue.poll();
            result.add(binary);

            queue.offer(binary + "0");
            queue.offer(binary + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int n= 5;
        List<String> binaryNumbers= generateBinaryNumbers(5);
        System.out.println("First " + n + " binary numbers: " + binaryNumbers);
    }
}
