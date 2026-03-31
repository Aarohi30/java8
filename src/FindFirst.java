import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println(findFirstEven(list));
        System.out.println(findFirstEvenAfterJava8(list));
    }

    public static int findFirstEven(List<Integer> list){
        int firstEven = -1;
        for(int num : list){
            if(num%2==0){
                firstEven = num;
                break;
            }
        }
        return firstEven;
    }

    public static int findFirstEvenAfterJava8(List<Integer> numList){
        
        return numList.stream().filter(num -> num%2 == 0).findAny().get();
        
    }
}
