package oopConcepts.oop.polimorphism.sample2;

public class Runner {
    public static void main(String[] args) {

        Student std1 = new Student();
        std1.name="Ogrenci";
        std1.age=18;
        std1.phoneNumber="000";

        Teacher tch1 = new Teacher();
        tch1.name="Mirac";
        tch1.age=41;
        tch1.phoneNumber="111";

        printInfoForStudents(std1);
       // printInfoForStudents(tch1); öğretmen methodu olmadıgı icin kızardı
        printInfoForTeacher(tch1);

        System.out.println("Ayni sonucu ve tek metod ve polymorphism ile yazalim");
        printInfoWithPolymorphism(tch1);
        printInfoWithPolymorphism(std1);
    }

    public static void printInfoForStudents(Student std){ //gereksiz
        System.out.println("name : " + std.name);
        System.out.println("age : " + std.age);
        System.out.println("phone-number : " + std.phoneNumber);
    }

    public static void printInfoForTeacher(Teacher tch1){ //gereksiz
        System.out.println("name : " +tch1 .name);
        System.out.println("age : " + tch1.age);
        System.out.println("phone-number : " + tch1.phoneNumber);
    }

    public static void printInfoWithPolymorphism(User user) { //tek basina yeterli
        System.out.println("name : " +user.name);
        System.out.println("age : " + user.age);
        System.out.println("phone-number : " + user.phoneNumber);
    }
}
