package streamString;


import java.util.*;

public class TesthashCode {

    public static void main(String[] args) {

        Map<String, Integer> productPrice = new HashMap<>();
        productPrice.put("mouse", 2000);
        productPrice.put("keyboard", 600);
        productPrice.put("mouse", 8000);
        System.out.println(productPrice);
        Set<Employee> set = new HashSet<>();
        set.add(new Employee(1));
        set.add(new Employee(1));
        System.out.println(set.size());
        for (Employee e : set) {
            System.out.println("employee:==>" + e.id);
        }

        Optional<String> name = Optional.ofNullable("Optional tests");

        System.out.println(name.orElse("Default"));

        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "four", "5ive", "six");

        listOfStrings.stream().filter(s -> Character.isDigit(s.charAt(0))).forEach(System.out::println);

        listOfStrings.stream().filter(s -> Character.isUpperCase(s.charAt(0))).forEach(System.out::println);


    }
}
