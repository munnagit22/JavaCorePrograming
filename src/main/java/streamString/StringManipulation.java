package streamString;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringManipulation {
    public static void main(String[] args) {
        String inputStr = "java is object Oriented Language";

        String replaceStr = "is object ";
        System.out.println(inputStr.replace("is object Oriented", ""));
        // remove the words from give input String
        String[] arrayStr = inputStr.split("\\s+", 0);
        String newStr = Arrays.stream(arrayStr).filter(word -> !replaceStr.contains(word))
                .collect(Collectors.joining(" "));
        System.out.println("After Removing word from string==>"+newStr);
        // Remove a specific character from given string
        char ch = 'o';
        String inputStr2="Good Morning";
        String resultStr = inputStr2.chars().mapToObj(c -> String.valueOf((char) c))
                .filter(c -> !c.equalsIgnoreCase(String.valueOf(ch))).collect(Collectors.joining(""));
        System.out.println("After replacing of char==>"+resultStr);

        // check that letters of second string exist in first string , if present then return true or false;

        String firstStr="Stream is interface which is define java.util.stream package";
        String secondStr="java";

        boolean b = secondStr.chars().mapToObj(c -> String.valueOf((char) c)).allMatch(firstStr::contains);
        System.out.println("is Second string exist in first String==>"+b);


    }
}
