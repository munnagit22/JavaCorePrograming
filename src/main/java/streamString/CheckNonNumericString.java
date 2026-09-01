package streamString;

import java.util.stream.IntStream;

public class CheckNonNumericString {
    public static void main(String[] args) {
        String input = "Nonnumeric8String";

        boolean isNonNumericStr = IntStream.rangeClosed(0, input.length() - 1)
                .allMatch(i -> Character.isAlphabetic(input.charAt(i)));
        System.out.println(isNonNumericStr);
    }
}
