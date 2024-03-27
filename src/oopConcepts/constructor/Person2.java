package oopConcepts.constructor;


import lombok.Builder;

@Builder
//aslında bir interfacedir,
//@builder dediğimiz anda  otomatik olarak parametreli cont. hepsi var

public class Person2 {
    //PROJEMİZ MAVEN PROJESİ OLSAYDI POM.EXML E GİDİP DEPEND İNSTACKLARI ARASINA LOMBOK BİLGİLERİNİ GİRECEKTİK SONRA M 'YE tıklayıp otomatik bulacaktı

    private String name;
    private String surname;
    private int age;
    private int phoneNumber;

    public static void main(String[] args) {

        //name + surname ile nesne uretelim:
        Person2 person = Person2.builder()
                .name("Mirac")
                .surname("Instructor")
                .build();
        System.out.println(person.name);

        //name+surname+age ile nesne üretelim

        Person2 person2 = Person2.builder()
                .name("Şadiye")
                .surname("Şahin")
                .age(27)
                .build();
        System.out.println(person2.name);

        Person2 person3 = Person2.builder()
                .name("Kumral")
                .surname("Karatay")
                .phoneNumber(000)
                .build();

        System.out.println(person3.name + "---" + person3.surname);
    }

}
