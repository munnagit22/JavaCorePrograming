package streamString;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCounStringList {
    public static void main(String[] args) {
        List<String> stringList= List.of("apple bannana apple", "banana orange banana apple", "orange apple banana");
        System.out.println(stringList);
        Map<String, Long> wordMap = stringList.stream().flatMap(str -> Arrays.stream(str.split("\s+")))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        Map<String, Long> finalList = wordMap.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));
        System.out.println(wordMap);
        System.out.println("Final List==>"+finalList);
    }
}
