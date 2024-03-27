package oopConcepts.oop.encapsulation;

public class UserWithEncapsulation {

    private String name;
    private String surname;
    private String password;

    private UserWithEncapsulation(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

    //dısaridan erisemeyecegim degiskenleri(public erisim belirleyici) Getter-Setter methodlariyla degistirebilir ve degrini okuyabilirim

    //degistirilmesini istemedigim degiskenin setter methodunu yazmam

    public String getName() {
        return name;
    }

  /*  public void setName(String name) {
        this.name = name;
    }*/

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        UserWithEncapsulation user1 = new UserWithEncapsulation("Ada","Sani","147852");
        //user1.setName("KAsim"); name i kapattıgımız için degisim yapamayiz(enapsulationdan dolayi)

     }
}
