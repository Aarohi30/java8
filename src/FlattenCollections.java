import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenCollections {
    public static void main(String[] args) {
        List<List<Integer>> nestedArrList = Arrays.asList(
            Arrays.asList(1,2),
            Arrays.asList(3,4)
        );

        List<Integer> flatList = flattenNestedList(nestedArrList);
        System.out.println(flatList);
        System.out.println("");
        List<Integer> flatListJava8 = nestedArrList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(flatList);
    }

    public static List<Integer> flattenNestedList(List<List<Integer>> nestedList){
        List<Integer> flattenedList = new ArrayList<>();
        for(List<Integer> arrList : nestedList){
            flattenedList.addAll(arrList);
        }
        return flattenedList;
    }
}
