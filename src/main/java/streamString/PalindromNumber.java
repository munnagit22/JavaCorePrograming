package streamString;

import java.util.stream.IntStream;

public class PalindromNumber {
    public static void main(String[] args) {
        int num = 887788;

        String numStr = String.valueOf(num);

        boolean isPalindrom = IntStream.range(0, String.valueOf(num).length() / 2).allMatch(i ->
                numStr.charAt(i) == numStr.charAt(numStr.length() - 1 - i));
        System.out.println(isPalindrom);

        // without converting into string

        int reverNum = IntStream.iterate(num, n -> n != 0, n -> n / 10)
                .map(n -> n % 10).reduce(0, (total, digit) -> total * 10 + digit);

        System.out.println(num==reverNum?"Palindrome":"not palindrome" );
    }
}
