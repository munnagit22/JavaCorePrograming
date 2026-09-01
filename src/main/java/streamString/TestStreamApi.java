package streamString;

import java.util.*;
import java.util.stream.Collectors;

public class TestStreamApi {

    public static void main(String[] are) {


        List<Integer> num = Arrays.asList(4, 8, 6, 10, 4, 6, 2, 5, 8);

        Set<Integer> dpnum = new HashSet<>();
        List<Integer> list = num.stream().filter(dpnum::add).toList();
        System.out.println(list);


        int sum = num.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();

        System.out.println("sum of Even number==>" + sum);

        String s1 = "hellow world";
        String s2 = "hellow world";
        String s3 = new String("hellow world test");
        String s5 = new String("hellow world");
        String s4 = null;
        System.out.println(s1.concat(" india"));
        String s6 = s1.concat("programming");
        System.out.println("test con=" + s6);
        System.out.println(s3 == s5);
        System.out.println("equal method=>" + "hellow world".equals(s3));
        System.out.println("concatenate==>" + s1.concat("java"));


        String str = "aaccggxffeer";

        List<String> cityName = List.of("Delhi", "8patna", "Delhyi", "4shanghai", "apple65Mango", "Orange435");
        Map<String, Long> wordCount = cityName.stream()
                .collect(Collectors.groupingBy(city -> city, Collectors.counting()));

        System.out.println("word count=>" + wordCount);


        Optional<Character> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println("non repeated char=" + result.get());


//        TestImmutableClass  testImmutableClass= new TestImmutableClass(1235,cityName);
//        int id = testImmutableClass.getId();
//        System.out.println("Id==="+id);
//        System.out.println("list of city name=="+testImmutableClass.getName());
//        StudentRecord stdr= new StudentRecord(234,"Rakesh",5);
//        System.out.println(stdr);



        String str2="JIGYANSHU PRAJAPATI";
        Character c1 = str2.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet().stream().filter(c -> c.getValue() == 1).map(Map.Entry::getKey).findFirst()
                .orElse(null);
        System.out.println("c1===>"+c1);

        Map<Character, Long> collect = str2.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);



//        List<Person> people = Arrays.asList(
//                new Person("Alice", 20, "New York"),
//                new Person("Bob", 17, "Los Angeles"),
//                new Person("Charlie", 22, "Chicago"),
//                new Person("David", 19, "Miami"),
//                new Person("Eve", 15, "Boston")
//        );
//
//
//        List<String> personName=  people.stream().filter(p->p.getAge()>18).sorted(Comparator.comparing(Person::getAge).reversed()).map(Person::getName).toList();
//        List<String> personName3=  people.stream().filter(p->p.getAge()>18).map(Person::getName).sorted().toList()  ;
//
//        System.out.println();
//

    }
}
