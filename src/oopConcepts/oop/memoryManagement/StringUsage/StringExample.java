package oopConcepts.oop.memoryManagement.StringUsage;

public class StringExample {



    public static void main(String[] args) {

        String result = "";

        long startTime = System.currentTimeMillis();

        for (long i=0 ; i<100000 ; i++) {
            result += "some text";
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Tİme : " + ( endTime - startTime) + "ms"); //12788
    }


}
