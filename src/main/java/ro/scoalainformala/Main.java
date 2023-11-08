package ro.scoalainformala;

public class Main {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(1,2,3,4,5);
        Triangle triangle1=new Triangle();
        triangle1.setAll(2,3,4,5,6);

        System.out.println("Aria triunghiului 1 este "+triangle.aria()+" iar perimetrul este "+triangle.perimetru());
        System.out.println("Aria triunghiului 2 este "+triangle1.aria()+" iar perimetrul este "+triangle1.perimetru());
        System.out.println();

        Rectangle rectangle=new Rectangle(1,2);
        Rectangle rectangle1=new Rectangle();
        rectangle1.setLatime(5);
        rectangle1.setLungime(10);

        System.out.println("Aria dreptunghiului 1 este "+rectangle.aria()+" iar perimetrul este "+rectangle.perimetru());
        System.out.println("Aria dreptunghiului 2 este "+rectangle1.aria()+" iar perimetrul este "+rectangle1.perimetru());
        System.out.println();

        Square square=new Square(18.4);
        Square square1=new Square();
        square1.setLatura(11.2);

        System.out.println("Aria patratului 1 este "+square.aria()+" iar perimetrul este "+square.perimetru());
        System.out.println("Aria patratului 2 este "+square1.aria()+" iar perimetrul este "+square1.perimetru());
        System.out.println();

        Circle circle=new Circle(4);
        Circle circle1=new Circle();
        circle1.setRaza(69.69);

        System.out.println("Aria cercului 1 este "+circle.aria()+" iar perimetrul este "+circle.perimetru());
        System.out.println("Aria cercului 2 este "+circle1.aria()+" iar perimetrul este "+circle1.perimetru());
    }
}