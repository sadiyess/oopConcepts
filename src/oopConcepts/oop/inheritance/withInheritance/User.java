package oopConcepts.oop.inheritance.withInheritance;

public class User { //parent class
    public String name;//protected kullanabiliriz
    public String surname;
    public String username;
    public String password;
    public String phoneNumber;

    public void displayLessons(){//method
        System.out.println(name + " kisisinin tum dersleri...");
    }
}
