package oopConcepts.constructor;

public class Book {
    /*constructora neden ihtiyacımız var?
    constructor olmazsa obje üretemz miyim?
     constructoru kaldırırsak o classın nesnesini uretemeyız
     javanın yapısı nesne merkezli oldugu için constructorla baglanmistir

     her classın default constructoru olustururlur ve bekler
     nesne olmazsa oop den soz edemeyiz

     abstruction nedir? soyutlama. Gereksinimi nedir?

    */
    public String name ;
    public String author;
    public String publisher ;
    public int pageNumber ;
    public double price;

    /* public String name = "A";
    public String author = "B";
    public String publisher = "C";
    public int pageNumber = 100;
    public double price = 120.5;
    böyle yazarsak her üretilen kitapta valueları(değişkenleri) sabit olur*/

    //bu sınıf üretilirken bu parametrelerle üretilsin istediğiğm için constructor olusturuyorum

 public Book(java.lang.String name, java.lang.String author, java.lang.String publisher, int pageNumber, double price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.pageNumber = pageNumber;
        this.price = price;
    }

    //bu classtan bir instance olusturacagım
    //p.'li constructor defaultu ezer
    //p'li constructor olmasına ragmen parametresizde kullanmak istersek defaultu elle yazacagiz

    public Book(){
     //defaultu yazdık
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name="Seker Portakalı";
        book1.author="Vasconcelos";
        book1.publisher="Can Yayinlari";
        book1.pageNumber= 180;
        book1.price= 100.0;

        Book book2 = new Book("A", "B", "C", 100, 120.5);
    }


}
