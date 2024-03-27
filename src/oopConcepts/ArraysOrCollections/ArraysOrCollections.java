package oopConcepts.ArraysOrCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysOrCollections {

    //Arrays:Aynı tür verileri saklamak için kullanırız
    //Collections: arrayde esneklik zordur

    public static void main(String[] args) {

        int[] grades = new int[3]; //en fazla 3 eleman eklenebilir
        int[] grades2 = {85,43,93,65};

        System.out.println(Arrays.toString(grades2));

        //sabit boyut
        grades[0]=85;
        grades[1]=95;
        grades[2]=65;
       //grades[3]=55; //error verir

        //grades dizisi icinde 70degeri var mı? for--> if

        //not ortalamsını hesaplayalim
        int total = 0;
        for (int grade : grades){
            total += grade;
        }
        double avg = total/grades.length;
        System.out.println("avg = " + avg);

        //------------------------LIST-----------------------

        List<Integer> stfGrades = new ArrayList<>();

        //eleman ekliyoruz
        stfGrades.add(92);
        stfGrades.add(99);
        stfGrades.add(99);
        stfGrades.add(94);
        stfGrades.add(100);

        //eleman silme
        stfGrades.remove(Integer.valueOf(100));

        // listi ekrana yazalim
        System.out.println(stfGrades);

        // list icinde 70 degeri var mi ?
        System.out.println(stfGrades.contains(70));

        // list icindeki elemanlarin ortalamasi  ( contains . stream API , isEmpty , replace gibi komutlari kullanabiliyoruz)
        int totalGrades = stfGrades.stream().reduce(Math::addExact).get();
        double avgGrade = totalGrades / stfGrades.size();
        System.out.println(avgGrade);



    }

}
