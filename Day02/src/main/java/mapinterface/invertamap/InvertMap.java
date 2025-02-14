package mapinterface.invertamap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMap {
    public static <K,V> Map<V, List<K>> invertMap(Map<K,V> originalMap){
        Map<V, List<K>> invertedMap= new HashMap<>();

        for(Map.Entry<K,V> entry: originalMap.entrySet()){
            V value= entry.getValue();
            K key= entry.getKey();

            if (!invertedMap.containsKey(value)) {
                invertedMap.put(value, new ArrayList<>());
            }
            invertedMap.get(value).add(key);

        }
        return invertedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> inputMap= new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B",2);
        inputMap.put("C",1);

        Map<Integer, List<String>> invertedMap= invertMap(inputMap);
        System.out.println("Inverted Map: " + invertedMap);
    }
}
