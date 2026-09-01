package streamString;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ImutableTest
{
    public static void main(String arg[])
    {

        List<String> cityName= Arrays.asList("name","dfsd");
        TestImmutableClass obj=new TestImmutableClass(45,cityName,new Date());
        System.out.println("id="+obj.getId());
        System.out.println("City name=>"+obj.getName(0));
        System.out.println("Dob==>"+obj.getDob());


    }
}
