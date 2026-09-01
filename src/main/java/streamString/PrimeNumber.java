package streamString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumber {

    public static void main(String[] args) {

        List<Integer> primeNumberList = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeNumberList.add(i);
            }
        }

        List<Integer> primList = IntStream.range(1, 20).filter(n -> IntStream.range(2, n)
                .noneMatch(k -> n % k == 0)).boxed().toList();


        System.out.println(primeNumberList);
        System.out.println(primList);
    }
}