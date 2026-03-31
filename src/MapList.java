import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println(getSquareList(list));

        System.out.println("\n"+ getSquareListAfterJava8(list));
    }

    public static List<Integer> getSquareList(List<Integer> numList){
        List<Integer> squareList = new ArrayList<>();
        for(int num : numList){
            squareList.add(num * num);
        }
        return squareList;
    }

    public static List<Integer> getSquareListAfterJava8 (List<Integer> numList){
        return numList.stream().map(num -> num * num).collect(Collectors.toList());
    }
}