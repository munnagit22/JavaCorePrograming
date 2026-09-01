package streamString;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PartitionDemo {

    public static void main(String[] arg) {

        List<Integer> numList = List.of(2, 3, 5, 4, 7, 9, 12, 14, 8, 20, 4, 5);
        Map<Boolean, List<Integer>> evenList = numList.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Even Number list==>" + evenList.get(true));
        System.out.println("Odd Number list==>" + evenList.get(false));
        int oddNumberList = numList.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0))
                .get(false).stream().mapToInt(Integer::intValue).sum();
        System.out.println("Odd Number list==>" + oddNumberList);

        int sum = numList.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();


        String str = "prajapati";
//  Reverse the string
        String rvString = IntStream.range(0, str.length()).mapToObj(i -> String.valueOf(str.charAt(str.length() - 1 - i)))
                .map(String::valueOf).collect(Collectors.joining());

        System.out.println("reverse String==>" + rvString);
        System.out.println("sum==>" + sum);

        int n = 6;
        int k, i;
        for (i = 1; i < n; i++) {
            for (int j = 1; j<=i-1; j++) {

                System.out.print(" ");
            }
            for (k = 1; k <= n +1 - i; k++) {
                if (k <=n-i ) {
                    System.out.print("* ");
                } else {
                    System.out.println(" ");
                }
            }
        }
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n + i - 1; j++) {
//                if(j<=n-i)
//                    System.out.print(" *");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

    }


}
