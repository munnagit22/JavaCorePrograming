package streamString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestSortingStream {

    public static void main(String[] arg) {
        List<Integer> nums = List.of(5, 1, 4, 2);

        nums.stream().sorted((Integer::compareTo)).forEach(System.out::println);
        nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        //print 2 highest Number from list
        System.out.println("Two highest number==>");
        nums.stream().sorted(Comparator.reverseOrder()).limit(2).forEach(System.out::println);

        List<Integer> kk = nums.stream().sorted().limit(2).toList();

        Map<Boolean, List<Integer>> evenNum = nums.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        for (int k : kk) {
            System.out.println(k);
        }
        TestSortingStream test = new TestSortingStream();
        test.findNthMaxNumber();
        test.sortListByLastDigit();
        test.sortStringList();
        test.maxNumberFromTwoArray();
    }

    void findNthMaxNumber() {
        final float pi;
        {
            pi = 5.89f;
        }

        List<Integer> numList = List.of(4, 1, 6, 33, 5, 9);
        int nthNumber = 1;
        Integer first = numList.stream().sorted(Comparator.reverseOrder()).skip(nthNumber).
                findFirst().orElse(null);
        System.out.println("Highest Number:->" + first);
    }

    void maxNumberFromTwoArray() {
        int[] array1 = {1, 5, 3, 9, 7};
        int[] array2 = {2, 4, 6, 8, 10};

        Integer max = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).distinct().boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElse(null);
        System.out.println("Max Number:->" + max);
    }


    //write a script to a sort a Array of String in ascending oreder alphabetially
    void sortStringList() {
        List<String> wordList = List.of("Orange", "apple", "Mango");

        List<String> sortedWordList = wordList.stream().sorted(Comparator.comparing(w -> w.charAt(0))).toList();

        System.out.println("Sorted word list==>" + sortedWordList);
    }

    // sort the list of value by last digit of number in ascending order
    void sortListByLastDigit() {
        List<Integer> numList = List.of(44, 23, 21, 45, 22, 59, 27, 82, 64);
        Long startsq = System.currentTimeMillis();
        List<Integer> sortedList = numList.stream().sorted(Comparator.comparingInt(n -> n % 10)).toList();
        Long endSeq = System.currentTimeMillis();
        Long startpr = System.currentTimeMillis();
        List<Integer> sortedListp = numList.parallelStream().sorted(Comparator.comparingInt(n -> n % 10)).toList();
        Long endSp = System.currentTimeMillis();
        System.out.println("soted list===>" + sortedList);
        System.out.println("Sequential stream Time==>" + (endSeq - startsq));
        System.out.println("parallel stream Time==>" + (endSp - startpr));
    }
}
