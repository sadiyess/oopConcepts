package oopConcepts.oop.polimorphism.sample1;

public interface Shape {

    void draw(); //bu interfacei implements eden classlarla dolduracagiz

    //nesne uretemeyiz cunku constructor yok
    //abstract classın nesne üretemem ama constructoru var .abstract classlardan class uretmeyeceksek niye constructoru var? multiinheritance oldugu için yktur
    //abstract classtan extend edilen bir  sınıfın içerisine abstract constructor cagırılabilsin diye
    //super. kullananamamak contructoru yok demektir.
}
