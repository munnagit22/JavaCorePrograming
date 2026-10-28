package streamString;


import java.util.List;

import java.util.stream.IntStream;

public class FindIndex {
    public static void main(String[] args) {

        List<Integer> nums= List.of(1, 2, 3, 4, 3, 6, 7, 8, 9, 10);
        int target=30;
//Find the index of first repeated number in list.
        Integer result = IntStream.range(0, nums.size()).boxed().filter(i -> nums.get(i) == target).findFirst().orElse(-1);
        System.out.println("result="+result);

   }
}
