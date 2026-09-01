package streamString;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringWordsCount {
    public static void main(String[] args) {

        String input="Delhi\nis\tCapital\nof\n India";

        String[] wordArray = input.split("\n", 0);
        List<String>wordList= List.of(wordArray);
        Map<String, Long> wordMap = wordList.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        System.out.println("word count in String==>"+wordMap);
    }
}
