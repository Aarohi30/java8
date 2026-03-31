import java.util.Arrays;
import java.util.List;

public class PrintList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        printListBeforeJava8(list);
    }

    public static void printListBeforeJava8(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    public static void printListWithJava8(List<String> list) {
        list.forEach(System.out::println);
    }
}
