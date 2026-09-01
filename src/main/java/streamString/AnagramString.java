package streamString;

import java.util.stream.Collectors;

public class AnagramString {

    public static void main(String[] args) {

        String str1="cat";
        String str2="actt";

        String first=str1.toUpperCase().chars().sorted().mapToObj(c->String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(first);
        String second=str2.toUpperCase().chars().sorted().mapToObj(c->String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(second);
        if (first.equals(second)) {
            System.out.print("String is Anagram");
        } else {
            System.out.print(" String is not anagram");
        }

    }
}
