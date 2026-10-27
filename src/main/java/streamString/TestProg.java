package streamString;

import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestProg {

    public static void main(String[] args) {

//        String inputStr = "Capgemini Training";

//         originalStr.chars().distinct().mapToObj(c -> (char)c).forEach(System.out::print);
//        String resultStr = originalStr.chars().distinct().mapToObj(c -> String.valueOf((char) c))
//                .collect(Collectors.joining());
//        System.out.println(resultStr);
//
//        Map<Character, Long> map = originalStr.chars().mapToObj(c->(char)c).
//                collect(Collectors.groupingBy(c->c,Collectors.counting()));
//        System.out.println(map);
//        String revStr= IntStream.range(0,inputStr.length()).mapToObj(c->String.valueOf(inputStr.charAt(inputStr.length()-1-c)))
//                .collect(Collectors.joining());
//        System.out.println(revStr);
        String inputStr = "madam";
        Boolean plstring = IntStream.range(0, inputStr.length()).
                allMatch(i -> inputStr.charAt(i) == inputStr.charAt(inputStr.length() - 1 - i));
        System.out.println(plstring);

//       Find the first repeated char from string

        Character char1 = inputStr.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream().filter(c -> c.getValue() == 1).map(Map.Entry::getKey)
                .findFirst().orElse(null);
        System.out.println("First repeated char=>" + char1);
        System.out.println("non Repeated char=>" + char1);

      String   inputStr1="computeer";
        Character maxReptChar = inputStr1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c,
                        LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse(null);

        System.out.println("Max repeated char==>"+maxReptChar);
        List<Integer> listNum= List.of(4,2,55,23,591,21);

        Integer max = listNum.stream().sorted(Comparator.reverseOrder()).limit(1).findFirst().orElse(null);
        System.out.println("Second highest number==> "+max);

     int sum=   listNum.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum==>"+sum);

        List<Integer> numlist= List.of(3,4,-1,1);

        List<Integer> positiveList= numlist.stream().filter(n->n>0).distinct().sorted().toList();

        int k=  IntStream.iterate(1, i->i+1).filter(i->!positiveList.contains(i)).findFirst().getAsInt();

        System.out.println("k==>"+k);

      String strTest="A1b2B!k";

   String st= strTest.chars().mapToObj(c -> (char) c).filter(Character::isAlphabetic)
           .map(String::valueOf).collect(Collectors.joining()).toLowerCase();

        boolean booleanStream = IntStream.range(0, st.length()).allMatch(i -> st.charAt(i) == st.charAt(st.length() - 1 - i));

        System.out.println("st==>"+st );
        System.out.println("is palindrom==>"+booleanStream);

        List<Integer> numList2= List.of(4,2,55,23,591,2);

        Optional<Integer> data = numList2.stream().mapToInt(Integer::intValue).boxed()
                .collect(Collectors.groupingBy(n -> n, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(d->d.getValue()>1).map(Map.Entry::getKey).findFirst();

        System.out.println("data==>"+data.orElse(null));

    }
}
