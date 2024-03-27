package oopConcepts.oop.abstraction;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(10,20);
        System.out.println("result = " + result);

        //JBCDden Abstraction ile ilgili örnek:
        //java kodlarının içine sql kodlarnı gömüyorduk
        //Statement(nesnemiz) --> st.execute()
    }
}
