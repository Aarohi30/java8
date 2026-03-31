import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.print(getEvenList(list));
        System.out.print("\n"+getEvensAfterJava8(list));
        
    }

    public static List<Integer> getEvenList(List<Integer> list){
        List<Integer> evens = new ArrayList<>();
        for(int num : list){
            if(num%2 == 0)
            evens.add(num);
        }
        return evens;
    }

    public static List<Integer> getEvensAfterJava8(List<Integer> list){
        List<Integer> evensAfterJava8 = list.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        return evensAfterJava8;
    }
}
