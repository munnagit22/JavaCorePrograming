package streamString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args) {
        List<Integer> numlist = Arrays.asList(1, 2, 3, 4, 6);

        int expSum = IntStream.rangeClosed(1, 6).sum();

        int sum = numlist.stream().mapToInt(Integer::intValue).sum();
        int missingNum = expSum - sum;
        System.out.println("missing number:->" + missingNum);

        // Anoth approch
        List<Integer> numlist2 = Arrays.asList(1, 2, 3, 4, 6,8,10);
        Set<Integer> numset = new HashSet<>(numlist2);

        List<Integer> missingList = IntStream.rangeClosed(1, 10).filter(i -> !numset.contains(i)).boxed().toList();

        System.out.println("missing numbers:"+missingList);
       for(int m :missingList)
        {
            System.out.println(m);
        }

       MissingNumber missingNumber= new MissingNumber();
        missingNumber.evenNumMissing();
        missingNumber.oddNumberMissing();


    }
    void evenNumMissing()
    {  int result=1;
        List<Integer>evenNumber= List.of(2,4,6,10,12,14,16);

        int sum=IntStream.rangeClosed(2,16).filter(n->n%2==0).sum();
        System.out.println("sum of Even number==>"+sum);
        int listSum=evenNumber.stream().mapToInt(Integer::intValue).sum();
        int missingNum= sum-listSum;
        System.out.println("missing number=>"+missingNum);
    }
   void oddNumberMissing(){
        List<Integer>oddNumList= List.of(1,3,7,9,11,13,15);
         int oddNumSum= IntStream.rangeClosed(1,15).filter(n->n%2!=0).sum();
         int listSum= oddNumList.stream().mapToInt(Integer::intValue).sum();
         int missingNum=oddNumSum-listSum;
       System.out.println("Odd missing Number:=>"+missingNum);
   }
}
