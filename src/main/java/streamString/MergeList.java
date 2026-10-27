package streamString;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {

    public static void main(String[] args) {

        List<String> list1= List.of("java","python");
        List<String> list2= List.of("java","Abc");

        List<String> finalList = Stream.concat(list1.stream(),list2.stream())
                .distinct().toList();

        System.out.println("After merging the list==>"+finalList);
    }
}
