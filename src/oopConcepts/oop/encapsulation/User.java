package oopConcepts.oop.encapsulation;

public class User {
    public String name;
    public String surname;
    public String password;

    public User(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

    public static void main(String[] args) {
        User user1= new User("Şadiye","Eda","1234578");
        System.out.println(user1.name);

        //istersek olusturulan bu nesnenin herhangi bir degiskenini degistirebiliriz
        user1.name = "Mesut";

        //olusturdugum bu degiskenlerin bazilarinin daha sonra degistirilmesini istemiyorsam
        // yada hepsinin okunmasini ve bazilariin degistirilmesini istemiyorsam  encapsulation yontemi kullanmaliyim
    }

}
