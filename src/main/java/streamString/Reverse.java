package streamString;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reverse {

    public static void main(String[] args) {
        Reverse obj = new Reverse();
        obj.reversString();

        //palindrom
        obj.validatePalindrom();
        obj.findFirstNonRepeatedChar();
        obj.findMaxNumber();
    }

    void reversString() {
        String str = "Java";
        String rstr = IntStream.range(0, str.length())
                .mapToObj(i -> String.valueOf(str.charAt(str.length() - 1 - i)))
                .collect(Collectors.joining());
        System.out.println("Reverse String==>" + rstr);
    }

    void validatePalindrom() {
        String st = "dalda";

        boolean ispalindrom = IntStream.range(0, st.length())
                .allMatch(i -> st.charAt(i) == st.charAt(st.length() - 1 - i));
        System.out.println("is String palindrom==>" + ispalindrom);

    }

    void findFirstNonRepeatedChar() {
        String str = "sbstexyt";

        Character ch = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet().stream().filter(c -> c.getValue() == 1)
                .map(Map.Entry::getKey).findFirst().orElse(null);
    }

    void findMaxNumber() {
        int[] ar1 = {3, 5, 8, 9};
        int[] ar2 = {10, 2, 1, 4, 89};

        Integer max = IntStream.concat(IntStream.of(ar1), IntStream.of(ar2)).distinct().boxed()
                .sorted(Comparator.reverseOrder()).findFirst().orElse(null);
        System.out.println("Max Number==>" + max);
    }

}
