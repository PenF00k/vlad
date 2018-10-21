package ru.penf00k.vlad.figures;

public class Main {

    public static void main(String[] args) {
        Figure circle = new Circle(5);
        printArea(circle);
        //System.out.println(Circle.getArea(5));

        Figure rect = new Rectangle(4, 5);
        printArea(rect);

        Figure square = new Square(9);
        printArea(square);
    }

    private static void printArea(Figure figure) {
        System.out.println(
                figure.getClass().getSimpleName() + " area = " + figure.getArea()
        );
    }
}
