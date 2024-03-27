package oopConcepts.oop.polimorphism.sample1;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Circle circle1= new Circle();
        circle1.draw();

        //circle1 = new Triangle(); bu  problemi cözmek icin
        //1.yol:tavsiye edilmez. Her nesne için ayrı ayrı degisken olustururuz
        Square square1= new Square();
        square1.draw();

        Triangle triangle1 = new Triangle();
        triangle1.draw();

        //2.yol polimorphism
        System.out.println("*****************POLIMORPHISM*****************");
        Shape shape1 = new Circle();
        shape1.draw();

        shape1 = new Triangle();
        shape1.draw();

        shape1 = new Square();
        shape1.draw();

        //sonuc: bir degisken ile ayni turde farkli nesneleri karsilayabilirim

       // List<String> names = new ArrayList<>(); //sol taraf hep interfce sag taraf concreate class

    }
}
