package streamString;

public class Java17Feature {

    public static void main(String[] args) {

        // switch case

        String str= """
        "dob": "2000-05-15T00:00:00.000Z",
        "emailId": "john.doe@example.com",
        "id": "986",
        "studentName": "John """ ;
        System.out.println("multiple Line==>"+ str);

        testSwithch(3);


    }

    static void testSwithch(int k)
    {

        String result= switch (k) {
            case 1 -> "one";
            case 2-> "Two";
            case 3 -> {
                System.out.println("Warning state detected.");
                yield "Suspended"; // Returns the value for this case block
            }
            default -> "not valid";
        };
        System.out.println("switch value=="+result);
    }
}

