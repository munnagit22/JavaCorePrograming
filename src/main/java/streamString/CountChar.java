package streamString;


import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountChar {

    public static void main(String[] args) {
/*
        String input = "programminipulg";

        // count the distinct char in String
        System.out.println(input.chars().distinct().count());
        String test = "Communication";
        Map<Character, Long> charCount1 = test.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c,
                Collectors.counting()));
        System.out.println("character count in string==>" + charCount1);

// count occurrence the words in list
        List<String> cityName = List.of("Delhi", "8patna", "Delhyi", "Delhi", "4shanghai", "apple65Mango", "Orange435");

        Map<String, Long> wordCount = cityName.stream().collect(Collectors.groupingBy(city -> city, Collectors.counting()));
        System.out.println("Occurrence of word==>" + wordCount);
// find first repeat word in list
        cityName.stream().filter(w -> Collections.frequency(cityName, w) > 1).findFirst().ifPresent(System.out::println);
        // reverse the string
        String testString = "MadaM";
        String reversed = IntStream.range(0, testString.length())
                .mapToObj(i -> String.valueOf(testString.charAt(testString.length() - 1 - i)))
                .collect(Collectors.joining());
        System.out.println("Reverse String==>" + reversed);
// palindrom
        String testpldm = "madam";
        boolean ispalindrome = IntStream.range(0, testString.length() / 2)
                .allMatch(i -> testpldm.charAt(i) == testpldm.charAt(testpldm.length() - 1 - i));
        System.out.println("isString is palindrom==>" + ispalindrome);

        // find the words in list starting with number
        List<String> wordStartNumber = cityName.stream().filter(w -> Character.isDigit(w.charAt(0))).toList();
        System.out.println("wordStartNumber" + wordStartNumber);

        // find the word having number in list
        List<String> wordNumeric = cityName.stream().filter(word -> word.chars().anyMatch(Character::isDigit)).toList();
        System.out.println("wordNumeric==>" + wordNumeric);


        // Find the length of each word in list
        List<String> wordCountList = List.of("computer", "desktop", "Laptop");
        Map<String, Integer> wordCoun = wordCountList.stream().collect(Collectors
                .toMap(word -> word, String::length));
        System.out.println("length of each word==>" + wordCoun);


     // Find the non repeated char in string
        String str2="JIGYANSHU PRAJAPATI";
        Character c1 = str2.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet().stream().filter(c -> c.getValue() == 1).map(Map.Entry::getKey).findFirst()
                .orElse(null);
        System.out.println("c1===>"+c1);


        IntSummaryStatistics summariaeData = Stream.of(4, 9, 2, 4).collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("summary==>" + summariaeData);

*/
//        String strw="hello word computer hdd hello keyboard";
//        String[] split = strw.split(" ", 0);
//        Stream<String>st= Stream.of(split);
//        Map<String, Long> wordCnt = st.collect(Collectors.groupingBy(w -> w, Collectors.counting()));
//        System.out.println("Word count in String===>"+wordCnt);

        String originalStr = "Capgemini Training";

        String reverseStr = IntStream.range(0, originalStr.length())
                .mapToObj(i -> String.valueOf(originalStr.charAt(originalStr.length() - 1 - i))).collect(Collectors.joining());
        System.out.println("Reverse String==>" + reverseStr);

        // Return first half of given even length string

        String strEvenln = "JAVA";

        String resultStr = IntStream.range(0, strEvenln.length() / 2).mapToObj(s -> String.valueOf(strEvenln.charAt(s)))
                .collect(Collectors.joining("h"));
        System.out.println("First Half of give String:=>" + strEvenln + "is :" + resultStr);
//        find the maximum occurring character in a string.

        String str2 = "java programing language";

        Map<Character, Long> charCountMap = str2.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Character c = charCountMap.entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse(null);

        System.out.println(charCountMap);
        System.out.println("max repeated char==>" + c);


        String repeatedCharWor = IntStream.range(0, strEvenln.length()).
                mapToObj(s -> new StringBuilder(String.valueOf(strEvenln.charAt(s)))
                        .append(strEvenln.charAt(s)))
                .collect(Collectors.joining());
        System.out.println(repeatedCharWor);

    }

    void swap() {
        int a = 20;
        int b = 50;
        a = a + b;
        b = a - b;
        a = b - a;
        System.out.println("a=" + a + "b=" + b);
    }


}
