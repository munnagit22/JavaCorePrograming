package streamString;

import java.util.Map;
import java.util.stream.Collectors;

public class VowelFrequencyCount {
    public static void main(String[] args) {

        String inputStr = "Copgemini Inida";

        String vowel = "aeiouAEIOU";

        Map<Character, Long> vowelCount = inputStr.chars().mapToObj(c -> (char) c)
                .filter(c -> vowel.indexOf(c) != -1)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("Vowel count"+vowelCount);


    }
}
