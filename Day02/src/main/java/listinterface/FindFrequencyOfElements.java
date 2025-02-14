package listinterface;

import java.util.*;

public class FindFrequencyOfElements {
    public static Map<String,Integer> countFrequency(List<String> list){
        Map<String,Integer> frequencyMap= new HashMap<>();

        for(String item: list){
            frequencyMap.put(item, frequencyMap.getOrDefault(item,0)+1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> result= countFrequency(list);
        System.out.println(result);
    }
}
