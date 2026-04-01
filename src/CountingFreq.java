import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingFreq {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple");
        Map<String,Integer> map = getCountMap(fruits);
        for(String fruit : map.keySet()){
            System.out.println(fruit+" "+map.get(fruit));
        }

        System.out.println("");

        Map<String,Long> mapJava8 = getCountMapAfterJava8(fruits);
        for(String fruit : mapJava8.keySet()){
            System.out.println(fruit+" "+map.get(fruit));
        }
        
    }

    public static Map<String, Integer> getCountMap(List<String> fruitList){
        Map<String, Integer> countMap = new HashMap<String, Integer>();
        for(String fruit : fruitList){
            if(countMap.containsKey(fruit)){
                int count = countMap.get(fruit);
                countMap.put(fruit, ++count);
            } else{
                countMap.put(fruit, 1);
            }
        }
        return countMap;
    }
    public static Map<String, Long> getCountMapAfterJava8(List<String> fruitList){
    return fruitList.stream().collect(Collectors.groupingBy(f -> f, Collectors.counting()));
    }
    
}
