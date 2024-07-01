package lesson.university;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape square = new Square();
        System.out.println("Without border");
        circle.draw();
        circle.resize();

        square.draw();
        square.resize();

        Shape concreteDecorate_circle = new ConcreteDecorate(new Circle());
        Shape concreteDecorate_square = new ConcreteDecorate(new Square());

        System.out.println("\n\n\nwith Border ");
        concreteDecorate_circle.draw();
        concreteDecorate_circle.resize();

        concreteDecorate_square.draw();
        concreteDecorate_square.resize();

    }
}
